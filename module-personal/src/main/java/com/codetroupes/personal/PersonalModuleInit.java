package com.codetroupes.personal;

import android.app.Application;

import com.codetroupes.library.base.IModuleInit;
import com.codetroupes.mvvmhabit.utils.KLog;


/**
 *
 * @author jeffrey
 * @date 2020/4/24
 */

public class PersonalModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("用户模块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("用户模块初始化 -- onInitLow");
        return false;
    }
}
