package com.ljs.auth.service.impl;

import com.atguigu.model.system.SysRole;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ljs.auth.mapper.SysRoleMapper;
import com.ljs.auth.service.SysRoleService;
import org.springframework.stereotype.Service;

/**
 * @author ljs
 * @version 1.0
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    // MP已经将mapper注入
}
