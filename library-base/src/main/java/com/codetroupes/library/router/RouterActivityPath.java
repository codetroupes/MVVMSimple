package com.codetroupes.library.router;

/**
 * 用于组件开发中，ARouter单Activity跳转的统一路径注册
 * 在这里注册添加路由路径，需要清楚的写好注释，标明功能界面
 * @author jeffrey
 * @date 2020/4/24
 */

public class RouterActivityPath {
    /**
     * 主业务组件
     */
    public static class Main {
        private static final String MAIN = "/main";
        /*主业务界面*/
        public static final String PAGER_MAIN = MAIN +"/MainActivity";
    }

    /**
     * 身份验证组件
     */
    public static class Sign {
        private static final String SIGN = "/sign";
        /*登录界面*/
        public static final String PAGER_LOGIN = SIGN + "/LoginActivity";
    }

    /**
     * 用户组件
     */
    public static class Personal {
        private static final String USER = "/user";
        /*用户详情*/
        public static final String PAGER_USER_DETAIL = USER + "/UserDetail";
    }





}
