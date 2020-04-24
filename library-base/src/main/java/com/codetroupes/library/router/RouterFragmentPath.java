package com.codetroupes.library.router;

/**
 * 用于组件开发中，ARouter多Fragment跳转的统一路径注册
 * 在这里注册添加路由路径，需要清楚的写好注释，标明功能界面
 * @author jeffrey
 * @date 2020/4/24
 */

public class RouterFragmentPath {
    /**
     * 首页组件
     */
    public static class Home {
        private static final String HOME = "/home";
        /*首页*/
        public static final String PAGER_HOME = HOME + "/Home";
    }

    /**
     * 商品组件
     */
    public static class Commodity {
        private static final String Commodity = "/commodity";
        /*商品详情*/
        public static final String PAGER_GOODS_DETAIL = Commodity + "/GoodsDetail";
    }

    /**
     * 消息组件
     */
    public static class Msg {
        private static final String MSG = "/msg";
        /*消息*/
        public static final String PAGER_MSG = MSG + "/msg/Msg";
    }

    /**
     * 用户组件
     */
    public static class Personal {
        private static final String PERSONAL = "/personal";
        /*我的*/
        public static final String PAGER_ME = PERSONAL + "/Me";
    }
}
