package com.ljs.auth.controller;


import com.atguigu.model.system.SysRole;
import com.baomidou.mybatisplus.extension.api.R;
import com.ljs.auth.service.SysRoleService;
import com.ljs.auth.service.impl.SysRoleServiceImpl;
import com.ljs.common.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ljs
 * @version 1.0
 */
@Api(tags = "角色管理接口")
@RestController // 可以返回json数据的controller
@RequestMapping("/admin/system/sysRole")
public class SysRoleController {


    // 注入Service
    @Resource
    private SysRoleService sysRoleService;

    // 查询所有的角色
//    @GetMapping("/findAll")
//    public List<SysRole> findAll() {
//        // 调用service的方法
//        List<SysRole> list = sysRoleService.list();
//        return list;Re    }

    @ApiOperation("查询所有的角色")
    @GetMapping("/findAll")
    public Result findAll() {
        // 调用service的方法
        List<SysRole> list = sysRoleService.list();
        return Result.ok(list);
    }




}
