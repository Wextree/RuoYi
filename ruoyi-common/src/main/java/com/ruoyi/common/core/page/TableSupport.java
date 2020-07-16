package com.ruoyi.common.core.page;

/**
 * 表格数据处理
 *
 */
public class TableSupport {
    /**
     * 封装分页对象
     */
    public static PageDomain getPageDomain(){
        PageDomain pageDomain = new PageDomain();
        pageDomain.setPageNum(1);
        return pageDomain;
    }

    public static PageDomain buildPageRequest(){
        return getPageDomain();
    }
}
