package com.ruoyi.common.utils;

import java.util.Collection;
import java.util.Map;

/**
 * 字符串工具类
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils {

    // 空字符串
    private static final String NULLSTR = "";

    // 下划线
    private static final char SEPARATOR = '_';


    /**
     * 判断一个Collection是否为空，包含List，Set，Queue
     * @param coll 要判断的Collection
     * @return true：空  false：不为空
     */
    public static boolean isEmpty(Collection<?> coll){
        return isNull(coll) || coll.isEmpty();
    }

    /**
     * 判断一个Collection是否为非空，包含List，Set，Queue
     * @param coll 要判断的Collection
     * @return true：非空  false：空
     */
    public static boolean isNotEmpty(Collection<?> coll){
        return !isEmpty(coll);
    }

    /**
     * * 判断一个对象数组是否为空
     *
     * @param objects 要判断的对象数组
     ** @return true：为空 false：非空
     */
    public static boolean isEmpty(Object[] objects){
        return isNull(objects) || objects.length == 0;
    }

    /**
     * * 判断一个对象数组是否非空
     *
     * @param objects 要判断的对象数组
     * @return true：非空 false：空
     */
    public static boolean isNotEmpty(Object[] objects){
        return !isEmpty(objects);
    }

    /**
     * * 判断一个Map是否为空
     *
     * @param map 要判断的Map
     * @return true：为空 false：非空
     */
    public static boolean isEmpty(Map<?, ?> map){
        return isNull(map) || map.isEmpty();
    }

    /**
     * * 判断一个Map是否为空
     *
     * @param map 要判断的Map
     * @return true：非空 false：空
     */
    public static boolean isNotEmpty(Map<?, ?> map)
    {
        return !isEmpty(map);
    }

    /**
     * * 判断一个字符串是否为空串
     * * 只有空格的字符串也属于空字符串
     * @param string String
     * @return true：为空 false：非空
     */
    public static boolean isEmpty(String string){
        // trim 去除前方空格
        return isNull(string) || NULLSTR.equals(string.trim());
    }

    /**
     * * 判断一个字符串是否为非空串
     *
     * @param string String
     * @return true：非空串 false：空串
     */
    public static boolean isNotEmpty(String string)
    {
        return !isEmpty(string);
    }


    /**
     * 判断一个对象是否为空
     * @param object Object
     * @return true：空  false：不为空
     */
    public static boolean isNull(Object object){
        return object == null;
    }

    /**
     * 判断一个对象是否非空
     * @param object Object
     * @return true：非空  false：空
     */
    public static boolean isNotNull(Object object){
        return !isNull(object);
    }

    /**
     * 驼峰命名转下划线
     */
    public static String toUnderScoreCase(String str){
        if (null == str)
            return null;

        StringBuilder stringBuilder = new StringBuilder();
        // 前置字符是否大写
        boolean preCharIsUpperCase = true;
        // 当前字符是否大写
        boolean curCharIsUpperCase = true;
        // 下一字符是否大写
        boolean nextCharIsUpperCase = true;

        for (int i = 0; i < str.length(); i++) {
            // 获取当前字符
            char c = str.charAt(i);
            // 查看前一个字符是不是大写，如果是第一个字符，那么它的前置字符默认为不是大写
            if (i > 0){
                preCharIsUpperCase = Character.isUpperCase(str.charAt(i-1));
            }else {
                preCharIsUpperCase = false;
            }

            // 查看当前字符是否大写
            curCharIsUpperCase = Character.isUpperCase(c);

            // 如果不是最后一个，判断下一个是不是大写
            if (i < (str.length() - 1)){
                nextCharIsUpperCase = Character.isUpperCase(str.charAt(i+1));
            }

            // 如果三个或者三个以上的连续大写字母，我们需要把这几个大写字母看成一个单词
            // "ABc" 类型要在B前面加'_'
            if (preCharIsUpperCase && curCharIsUpperCase && !nextCharIsUpperCase){
                stringBuilder.append(SEPARATOR);
            // "aBc" 或者 "aBC"类型在B前面加'_'
            }else if (i != 0 && !preCharIsUpperCase && curCharIsUpperCase) {
                stringBuilder.append(SEPARATOR);
            }
            stringBuilder.append(Character.toLowerCase(c));
        }

        return stringBuilder.toString();
    }

    /**
     * 去空格
     */
    public static String trim(String str)
    {
        return (str == null ? "" : str.trim());
    }

    /**
     * 是否包含字符串（不论大小写）
     *
     * @param str 验证字符串
     * @param strs 字符串组
     * @return 包含返回true
     */
    public static boolean inStringIgnoreCase(String str, String... strs){
        if (str != null && strs != null){
            for (String s: strs) {
                if (str.equalsIgnoreCase(trim(s))){
                    return true;
                }
            }
        }
        return false;
    }
}
