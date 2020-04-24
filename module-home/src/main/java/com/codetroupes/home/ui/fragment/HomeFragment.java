package com.codetroupes.home.ui.fragment;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.codetroupes.home.BR;
import com.codetroupes.home.R;
import com.codetroupes.home.databinding.FragmentHomeBinding;
import com.codetroupes.home.ui.viewmodel.HomeViewModel;
import com.codetroupes.library.router.RouterFragmentPath;
import com.codetroupes.mvvmhabit.base.BaseFragment;
import com.codetroupes.mvvmhabit.utils.ToastUtils;
import com.google.android.material.tabs.TabLayout;


/**
 * @author jeffrey
 * @date 2020/4/24
 */
@Route(path = RouterFragmentPath.Home.PAGER_HOME)
public class HomeFragment extends BaseFragment<FragmentHomeBinding, HomeViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_home;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
        // 使用 TabLayout 和 ViewPager 相关联
        binding.tabs.setupWithViewPager(binding.viewPager);
        binding.viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tabs));
        viewModel.addPage();
    }

    @Override
    public void initViewObservable() {
        viewModel.itemClickEvent.observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                ToastUtils.showShort(s);
            }
        });
    }
}
