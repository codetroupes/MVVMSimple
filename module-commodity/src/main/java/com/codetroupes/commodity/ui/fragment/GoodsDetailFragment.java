package com.codetroupes.commodity.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.codetroupes.commodity.BR;
import com.codetroupes.commodity.R;
import com.codetroupes.commodity.databinding.FragmentCommodityBinding;
import com.codetroupes.commodity.ui.viewmodel.GoodsDetailViewModel;
import com.codetroupes.library.router.RouterFragmentPath;
import com.codetroupes.mvvmhabit.base.BaseFragment;

/**
 *
 * @author jeffrey
 * @date 2020/4/24
 */
@Route(path = RouterFragmentPath.Commodity.PAGER_GOODS_DETAIL)
public class GoodsDetailFragment extends BaseFragment<FragmentCommodityBinding, GoodsDetailViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_commodity;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }
}
