package com.ljs.auth;


import com.atguigu.model.system.SysRole;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ljs.auth.mapper.SysRoleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @author ljs
 * @version 1.0
 */

@SpringBootTest
public class TestDemo1 {

    @Resource
    private SysRoleMapper mapper;

    // 获取表中的所有信息
    @Test
    public void getAll() {
        List<SysRole> list = mapper.selectList(null);
        for (SysRole role: list) {
            System.out.println(role);
        }
    }

    // 添加操作
    @Test
    public void add() {
        SysRole sysRole = new SysRole();
        sysRole.setRoleName("角色管理员");
        sysRole.setRoleCode("role");
        sysRole.setDescription("角色管理员");
        int rows = mapper.insert(sysRole);
        System.out.println(rows);
        System.out.println(sysRole);
    }

    // 修改操作
    @Test
    public void update() {

        // 根据id查询
        SysRole sysRole = mapper.selectById(9);
        // 设置修改值
        sysRole.setRoleName("oa系统角色管理员");
        // 调用方法实现最终修改
        int i = mapper.updateById(sysRole);

        System.out.println(i);

    }

    // 删除操作
    @Test
    public void deleteById() {
        int i = mapper.deleteById(9);
    }

    // 批量删除
    @Test
    public void deleteBatchIds() {
        int i = mapper.deleteBatchIds(Arrays.asList(1, 2));
    }

    // 条件查询
    @Test
    public void testQuery1() {
        // 创建QueryWrapper对象，调用方法来封装条件

        QueryWrapper<SysRole> wrapper = new QueryWrapper<>();
        // wrapper.eq() 等于 gt() 大于 ge() 大于等于 lt() 小于 le() 小于等于 like() 模糊查询
        // 前面为表中的字段名称，后面为需要查询的内容
        wrapper.eq("role_name", "总经理");
        // 调用MP方法实现查询操作
        List<SysRole> sysRoles = mapper.selectList(wrapper);

        System.out.println(sysRoles);

    }

    @Test
    public void testQuery2() {
        // 创建QueryWrapper对象，调用方法来封装条件
        LambdaQueryWrapper<SysRole> wrapper = new LambdaQueryWrapper<>();
        // 使用lambda表达式需要再关注字段名称
        wrapper.eq(SysRole::getRoleName, "总经理");
        // 调用MP方法实现查询操作
        List<SysRole> sysRoles = mapper.selectList(wrapper);

        System.out.println(sysRoles);

    }

}
