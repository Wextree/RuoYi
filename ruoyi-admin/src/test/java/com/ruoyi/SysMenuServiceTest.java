package com.ruoyi;

import com.ruoyi.system.domain.SysMenu;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.system.service.impl.SysMenuServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {RuoYiApplication.class})
public class SysMenuServiceTest {

    @Autowired
    private SysMenuServiceImpl sysMenuService;

    @Test
    public void testSelectMenusByUser(){
        SysUser user = new SysUser();
        user.setUserId(2L);
        List<SysMenu> menus = sysMenuService.selectMenusByUser(user);
        menus.forEach(System.out::println);
    }
}
