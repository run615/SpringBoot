package com.wangxs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc
 * @Author wangxs
 * @CreateTime 2022/2/21
 */
@Controller
public class MyController {

    @RequestMapping("/show")
    public String show(Model model) {
        System.out.println("sssss");

        List<String> list = new ArrayList<>();
        list.add("沈阳");
        list.add("上海");
        list.add("南京");
        model.addAttribute("list", list);

        return "show";

    }
}
