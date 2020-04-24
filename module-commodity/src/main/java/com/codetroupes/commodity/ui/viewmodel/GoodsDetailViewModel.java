package com.codetroupes.commodity.ui.viewmodel;

import android.app.Application;
import android.text.TextUtils;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;

import com.codetroupes.mvvmhabit.base.BaseViewModel;
import com.codetroupes.mvvmhabit.binding.command.BindingAction;
import com.codetroupes.mvvmhabit.binding.command.BindingCommand;
import com.codetroupes.mvvmhabit.bus.RxBus;

/**
 * @author Jeffrey Create on 2020/4/24 11:23
 */
public class GoodsDetailViewModel extends BaseViewModel {

    public GoodsDetailViewModel(@NonNull Application application) {
        super(application);
    }

}
