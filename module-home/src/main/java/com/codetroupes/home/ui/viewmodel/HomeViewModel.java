package com.codetroupes.home.ui.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.codetroupes.home.BR;
import com.codetroupes.home.R;
import com.codetroupes.home.ui.adapter.ViewPagerBindingAdapter;
import com.codetroupes.mvvmhabit.base.BaseViewModel;
import com.codetroupes.mvvmhabit.binding.command.BindingCommand;
import com.codetroupes.mvvmhabit.binding.command.BindingConsumer;
import com.codetroupes.mvvmhabit.bus.event.SingleLiveEvent;
import com.codetroupes.mvvmhabit.utils.ToastUtils;

import me.tatarka.bindingcollectionadapter2.BindingViewPagerAdapter;
import me.tatarka.bindingcollectionadapter2.ItemBinding;

/**
 * @author jeffrey
 * @date 2020/4/24.
 */

public class HomeViewModel extends BaseViewModel {
    public SingleLiveEvent<String> itemClickEvent = new SingleLiveEvent<>();
    public HomeViewModel(@NonNull Application application) {
        super(application);
    }

    public void addPage() {
        items.clear();
        //模拟3个ViewPager页面
        for (int i = 1; i <= 3; i++) {
            ViewPagerItemViewModel itemViewModel = new ViewPagerItemViewModel(this, "第" + i + "个页面");
            items.add(itemViewModel);
        }
    }

    //给ViewPager添加ObservableList
    public ObservableList<ViewPagerItemViewModel> items = new ObservableArrayList<>();
    //给ViewPager添加ItemBinding
    public ItemBinding<ViewPagerItemViewModel> itemBinding = ItemBinding.of(BR.viewModel, R.layout.item_viewpager);
    //给ViewPager添加PageTitle
    public final BindingViewPagerAdapter.PageTitles<ViewPagerItemViewModel> pageTitles = new BindingViewPagerAdapter.PageTitles<ViewPagerItemViewModel>() {
        @Override
        public CharSequence getPageTitle(int position, ViewPagerItemViewModel item) {
            return "条目" + position;
        }
    };
    //给ViewPager添加Adpter，请使用自定义的Adapter继承BindingViewPagerAdapter，重写onBindBinding方法
    public final ViewPagerBindingAdapter adapter = new ViewPagerBindingAdapter();
    //ViewPager切换监听
    public BindingCommand<Integer> onPageSelectedCommand = new BindingCommand<>(new BindingConsumer<Integer>() {
        @Override
        public void call(Integer index) {
            ToastUtils.showShort("ViewPager切换：" + index);
        }
    });
}
