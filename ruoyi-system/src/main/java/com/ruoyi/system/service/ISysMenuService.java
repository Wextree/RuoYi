package com.ruoyi.system.service;

import com.ruoyi.system.domain.SysMenu;
import com.ruoyi.system.domain.SysUser;

import java.util.List;

/**
 * 菜单 业务层
 *
 * @author ruoyi
 */
public interface ISysMenuService {
    /**
     * 根据用户ID查询菜单
     *
     * @param user 用户信息
     * @return 菜单列表
     */
    public List<SysMenu> selectMenusByUser(SysUser user);
}
