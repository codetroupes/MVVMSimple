package com.codetroupes.sign;

import android.app.Application;

import com.codetroupes.library.base.IModuleInit;
import com.codetroupes.mvvmhabit.utils.KLog;


/**
 * @author jeffrey
 * @date 2020/4/24
 */

public class SignModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("登录模块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("登录模块初始化 -- onInitLow");
        return false;
    }
}
