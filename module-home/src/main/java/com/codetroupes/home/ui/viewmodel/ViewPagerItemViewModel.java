package com.codetroupes.home.ui.viewmodel;


import androidx.annotation.NonNull;

import com.codetroupes.mvvmhabit.base.ItemViewModel;
import com.codetroupes.mvvmhabit.binding.command.BindingAction;
import com.codetroupes.mvvmhabit.binding.command.BindingCommand;

/**
 * @author jeffrey
 * @date 2020/4/24
 */

public class ViewPagerItemViewModel extends ItemViewModel<HomeViewModel> {
    public String text;

    public ViewPagerItemViewModel(@NonNull HomeViewModel viewModel, String text) {
        super(viewModel);
        this.text = text;
    }

    public BindingCommand onClick = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            //点击之后将逻辑转到adapter中处理
            viewModel.itemClickEvent.setValue(text);
        }
    });
}
