package com.wangxs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Desc
 * @Author wangxs
 * @CreateTime 2022/2/22
 */
@SpringBootApplication
public class PageHelperApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(PageHelperApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
