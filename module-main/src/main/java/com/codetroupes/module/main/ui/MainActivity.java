package com.codetroupes.module.main.ui;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.codetroupes.library.router.RouterActivityPath;
import com.codetroupes.module.main.BR;
import com.codetroupes.module.main.R;
import com.codetroupes.module.main.databinding.ActivityMainBinding;
import com.codetroupes.mvvmhabit.base.BaseActivity;
import com.codetroupes.mvvmhabit.base.BaseViewModel;

/**
 * @author jeffrey
 * @date 2020/4/24
 */
@Route(path = RouterActivityPath.Main.PAGER_MAIN)
public class MainActivity extends BaseActivity<ActivityMainBinding, BaseViewModel> {


    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }
}
