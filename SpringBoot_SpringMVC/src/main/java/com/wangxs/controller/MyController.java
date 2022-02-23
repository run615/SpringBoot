package com.wangxs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Desc
 * @Author wangxs
 * @CreateTime 2022/2/20
 */
@Controller
public class MyController {


    @RequestMapping("/show")
    @ResponseBody
    public String show() {
        return "hello12345678";
    }
}
