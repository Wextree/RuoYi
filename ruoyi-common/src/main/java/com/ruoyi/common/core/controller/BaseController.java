package com.ruoyi.common.core.controller;

import com.ruoyi.common.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.beans.PropertyEditorSupport;
import java.util.Date;

/**
 * web层通用数据处理
 */
public class BaseController {
    protected final Logger logger = LoggerFactory.getLogger(BaseController.class);

    /**
     * 将前台传递过来的日期格式的字符串，自动转化为Date类型
     */
    @InitBinder
    public void initBinder(WebDataBinder binder){
        // Date 类型转换
        binder.registerCustomEditor(Date.class, new PropertyEditorSupport(){
            @Override
            public void setAsText(String text) throws IllegalArgumentException {
                setValue(DateUtils.parseDate(text));
            }
        });
    }

    /**
     * 设置请求分页数据
     */
    protected void startPage(){

    }

}
