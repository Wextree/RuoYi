package com.ruoyi;

import com.ruoyi.system.domain.SysMenu;
import com.ruoyi.system.mapper.SysMenuMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {RuoYiApplication.class})
public class DaoTest {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Test
    public void testSelectAll(){
        List<SysMenu> menus = sysMenuMapper.selectMenuAll();

        menus.forEach(System.out::println);
    }
}
