package com.ruoyi.system.mapper;

/**
 * 角色与菜单关联表 数据层
 *
 * @author ruoyi
 */
public interface SysRoleMenuMapper {
    /**
     * 查询菜单使用数量
     *
     * @param menuId 菜单ID
     * @return 结果
     */
    int selectCountRoleMenuByMenuId(Long menuId);
}
