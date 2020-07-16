package com.ruoyi.common.core.page;

import com.ruoyi.common.utils.StringUtils;
import lombok.Data;

/**
 * 分页数据
 *
 * @author ruoyi
 */
public class PageDomain {
    /** 当前记录起始索引 */
    private Integer pageNum;
    /** 每页显示记录数 */
    private Integer pageSize;
    /** 排序列 */
    private String orderByColumn;
    /** 排序的方向 "desc" 或者 "asc". */
    private String isAsc;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderByColumn() {
        if (StringUtils.isEmpty(orderByColumn)){
            return "";
        }
        // 拼接后缀，然后排序列名需要按照驼峰命名转下划线
        return StringUtils.toUnderScoreCase(orderByColumn) + " " + isAsc;
    }

    public void setOrderByColumn(String orderByColumn) {
        this.orderByColumn = orderByColumn;
    }

    public String getIsAsc() {
        return isAsc;
    }

    public void setIsAsc(String isAsc) {
        this.isAsc = isAsc;
    }
}
