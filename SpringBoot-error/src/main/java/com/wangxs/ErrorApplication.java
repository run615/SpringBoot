package com.wangxs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Desc
 * @Author wangxs
 * @CreateTime 2022/2/23
 */
@SpringBootApplication
public class ErrorApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(ErrorApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}