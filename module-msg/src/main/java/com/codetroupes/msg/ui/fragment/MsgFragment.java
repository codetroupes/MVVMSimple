package com.codetroupes.msg.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.codetroupes.library.router.RouterFragmentPath;
import com.codetroupes.msg.BR;
import com.codetroupes.msg.R;
import com.codetroupes.msg.databinding.FragmentMsgBinding;
import com.codetroupes.msg.ui.viewmodel.MsgViewModel;
import com.codetroupes.mvvmhabit.base.BaseFragment;


/**
 * @author jeffrey
 * @date 2020/4/24
 */
@Route(path = RouterFragmentPath.Msg.PAGER_MSG)
public class MsgFragment extends BaseFragment<FragmentMsgBinding, MsgViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_msg;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
    }
}
