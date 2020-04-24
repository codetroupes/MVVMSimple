package com.codetroupes.commodity.debug;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.codetroupes.commodity.ui.fragment.GoodsDetailFragment;
import com.codetroupes.mvvmhabit.base.ContainerActivity;


/**
 * 组件单独运行时的调试界面，不会被编译进release里
 * @author jeffrey
 * @date 2020/4/24
 */

public class DebugActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, ContainerActivity.class);
        intent.putExtra("fragment", GoodsDetailFragment.class.getCanonicalName());
        this.startActivity(intent);
        finish();
    }
}
