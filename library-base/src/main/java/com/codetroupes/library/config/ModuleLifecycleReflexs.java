package com.codetroupes.library.config;

/**
 *
 * @author jeffrey
 * @date 2020/4/24
 * 组件生命周期反射类名管理，在这里注册需要初始化的组件，通过反射动态调用各个组件的初始化方法
 * 注意：以下模块中初始化的Module类不能被混淆
 */

public class ModuleLifecycleReflexs {
    private static final String BaseInit = "com.codetroupes.library.base.BaseModuleInit";
    //主业务模块
    private static final String MainInit = "com.codetroupes.module.main.MainModuleInit";
    //登录验证模块
    private static final String SignInit = "com.codetroupes.sign.SignModuleInit";
    //首页业务模块
    private static final String HomeInit = "com.codetroupes.home.HomeModuleInit";
    //商品业务模块
    private static final String CommodityInit = "com.codetroupes.commodity.CommodityModuleInit";
    //消息业务模块
    private static final String MsgInit = "com.codetroupes.msg.MsgModuleInit";
    //用户业务模块
    private static final String PersonalInit = "com.codetroupes.personal.PersonalModuleInit";

    public static String[] initModuleNames = {BaseInit, MainInit,SignInit, HomeInit, CommodityInit, MsgInit, PersonalInit};
}
