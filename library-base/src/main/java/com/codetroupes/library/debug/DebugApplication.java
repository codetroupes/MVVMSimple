package com.codetroupes.library.debug;



import androidx.multidex.MultiDex;

import com.codetroupes.library.config.ModuleLifecycleConfig;
import com.codetroupes.mvvmhabit.base.BaseApplication;


/**
 *
 * @author jeffrey
 * @date 2020/4/24
 * debug包下的代码不参与编译，仅作为独立模块运行时初始化数据
 */

public class DebugApplication extends BaseApplication {
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
