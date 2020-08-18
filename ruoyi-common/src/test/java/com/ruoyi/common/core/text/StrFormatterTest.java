package com.ruoyi.common.core.text;

import org.junit.Test;

public class StrFormatterTest {

    @Test
    public void testFormatter(){
        System.out.println(StrFormatter.format("this is \\{} for {}", "a", "b"));
    }
}