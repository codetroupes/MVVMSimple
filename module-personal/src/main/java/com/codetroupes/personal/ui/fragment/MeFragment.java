package com.codetroupes.personal.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.codetroupes.library.router.RouterFragmentPath;
import com.codetroupes.mvvmhabit.base.BaseFragment;
import com.codetroupes.personal.BR;
import com.codetroupes.personal.R;
import com.codetroupes.personal.databinding.FragmentMeBinding;
import com.codetroupes.personal.ui.viewmodel.MeViewModel;


/**
 * @author jeffrey
 * @date 2020/4/24
 */
@Route(path = RouterFragmentPath.Personal.PAGER_ME)
public class MeFragment extends BaseFragment<FragmentMeBinding, MeViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_me;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
        super.initData();
    }
}
