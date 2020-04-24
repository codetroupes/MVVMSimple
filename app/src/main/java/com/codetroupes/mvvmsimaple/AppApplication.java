package com.codetroupes.mvvmsimaple;


import androidx.multidex.MultiDex;

import com.codetroupes.library.config.ModuleLifecycleConfig;
import com.codetroupes.mvvmhabit.base.BaseApplication;


/**
 * @author Jeffrey
 */
public class AppApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化组件(靠前)
        ModuleLifecycleConfig.getInstance().initModuleAhead(this);
        //....
        MultiDex.install(this);
        //初始化组件(靠后)
        ModuleLifecycleConfig.getInstance().initModuleLow(this);
    }
}
