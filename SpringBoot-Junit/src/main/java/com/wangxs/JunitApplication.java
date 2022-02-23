package com.wangxs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Desc
 * @Author wangxs
 * @CreateTime 2022/2/22
 */
@SpringBootApplication
// 如果Mapper接口加了@Mapper注解，这里就不需要添加@MapperScan注解了
//@MapperScan("com.wangxs.mapper")
public class JunitApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(JunitApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
