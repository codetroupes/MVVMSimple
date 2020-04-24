package com.codetroupes.personal.ui.viewmodel;

import android.app.Application;

import android.text.TextUtils;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;

import com.codetroupes.mvvmhabit.base.BaseViewModel;
import com.codetroupes.mvvmhabit.binding.command.BindingAction;
import com.codetroupes.mvvmhabit.binding.command.BindingCommand;
import com.codetroupes.mvvmhabit.bus.RxBus;


/**
 * @author jeffrey
 * @date 2020/4/24
 */

public class UserDetailViewModel extends BaseViewModel {
    public ObservableField<String> nameObservable = new ObservableField();

    public UserDetailViewModel(@NonNull Application application) {
        super(application);
    }

    public void setName(String name) {
        nameObservable.set(name);
    }

    //回传参数
    public BindingCommand backOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            if (!TextUtils.isEmpty(nameObservable.get())) {
                //RxBus解耦组件通信
                RxBus.getDefault().post(nameObservable.get());
            }
            finish();
        }
    });
}
