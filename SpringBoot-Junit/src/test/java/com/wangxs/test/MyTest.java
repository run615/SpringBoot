package com.wangxs.test;

import com.wangxs.JunitApplication;
import com.wangxs.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @Desc
 * @Author wangxs
 * @CreateTime 2022/2/23
 */

// 指名测试工具
@RunWith(SpringJUnit4ClassRunner.class)
// 指名当前项目启动类文件，相当于拿到了web环境
@SpringBootTest(classes = JunitApplication.class)
public class MyTest {

    @Autowired
    private PersonService personService;


    @Test
    public void test() {
        System.out.println(personService.findAll());
    }

}
