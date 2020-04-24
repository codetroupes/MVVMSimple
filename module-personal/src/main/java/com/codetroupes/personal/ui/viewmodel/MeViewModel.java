package com.codetroupes.personal.ui.viewmodel;

import android.app.Application;
import android.text.TextUtils;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import com.alibaba.android.arouter.launcher.ARouter;
import com.codetroupes.library.contract._Login;
import com.codetroupes.library.global.SPKeyGlobal;
import com.codetroupes.library.router.RouterActivityPath;
import com.codetroupes.mvvmhabit.base.BaseViewModel;
import com.codetroupes.mvvmhabit.binding.command.BindingAction;
import com.codetroupes.mvvmhabit.binding.command.BindingCommand;
import com.codetroupes.mvvmhabit.bus.RxBus;
import com.codetroupes.mvvmhabit.bus.RxSubscriptions;
import com.codetroupes.mvvmhabit.utils.SPUtils;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;


/**
 *
 * @author jeffrey
 * @date 2020/4/24
 */

public class MeViewModel extends BaseViewModel {
    public ObservableInt loginBtnVisible = new ObservableInt();
    public ObservableField<String> userInfoObservable = new ObservableField();
    private Disposable subscribe;

    public MeViewModel(@NonNull Application application) {
        super(application);
    }

    @Override
    public void onCreate() {
        initData();
    }

    public void initData() {
        String userInfo = SPUtils.getInstance().getString(SPKeyGlobal.USER_INFO);
        if (!TextUtils.isEmpty(userInfo)) {
            userInfoObservable.set(userInfo);
            loginBtnVisible.set(View.GONE);
        } else {
            loginBtnVisible.set(View.VISIBLE);
        }
    }

    //登录按钮点击事件
    public BindingCommand startLoginOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            //采用ARouter+RxBus实现组件间通信
            ARouter.getInstance().build(RouterActivityPath.Sign.PAGER_LOGIN).navigation();
            subscribe = RxBus.getDefault().toObservable(_Login.class)
                    .subscribe(new Consumer<_Login>() {
                        @Override
                        public void accept(_Login l) throws Exception {
                            //登录成功后重新刷新数据
                            initData();
                            //解除注册
                            RxSubscriptions.remove(subscribe);
                        }
                    });
            RxSubscriptions.add(subscribe);
        }
    });
    //退出登录按钮点击事件
    public BindingCommand outLoginOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            SPUtils.getInstance().put(SPKeyGlobal.USER_INFO, "");
            initData();
        }
    });
}
