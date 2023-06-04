package com.ljs.auth;

import com.atguigu.model.system.SysRole;
import com.ljs.auth.service.impl.SysRoleServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ljs
 * @version 1.0
 */

@SpringBootTest
public class TestDemo2 {

    @Resource
    private SysRoleServiceImpl sysRoleService;

    @Test
    public void test1() {
        List<SysRole> list = sysRoleService.list();
        System.out.println(list);

    }

}
