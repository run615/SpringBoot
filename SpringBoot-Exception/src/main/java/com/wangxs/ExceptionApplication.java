package com.wangxs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Desc
 * @Author wangxs
 * @CreateTime 2022/2/23
 */
@SpringBootApplication
public class ExceptionApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(ExceptionApplication .class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}