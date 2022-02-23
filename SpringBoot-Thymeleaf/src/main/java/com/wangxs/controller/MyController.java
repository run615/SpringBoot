package com.wangxs.controller;

import com.wangxs.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
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
    public ModelAndView show(HttpSession session) {
        System.out.println("sssss");

        List<Person> list = new ArrayList<>();
        Person person = new Person();
        person.setAge(12);
        person.setName("wangxs");
        list.add(person);
        Person person1 = new Person();
        person1.setAge(13);
        person1.setName("qinjing");
        list.add(person1);


        ModelAndView mv = new ModelAndView();
        mv.addObject("list", list);
        mv.setViewName("show");

        session.setAttribute("person", "小家庭");

        return mv;

    }


    @RequestMapping("/index")
    public void index(int id, String name) {
        System.out.println(id + ";" + name);
    }
}
