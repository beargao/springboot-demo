package com.honor.config;


import com.honor.mapper.SysUserMapper;
import com.honor.model.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by rongyaowen
 * on 2019/1/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class Mapper2Test {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    public void selectTest() {
        List<SysUser> sysUsers = sysUserMapper.selectAll();
        for (SysUser sysUser : sysUsers) {
            System.out.println(sysUser);
        }
    }

}