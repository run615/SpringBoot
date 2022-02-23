package com.wangxs.controller;

import com.wangxs.pojo.Person;
import com.wangxs.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Desc
 * @Author wangxs
 * @CreateTime 2022/2/22
 */
@Controller
public class PersonController {


    @Autowired
    private PersonService personService;


    @RequestMapping("/getAll")
    @ResponseBody
    public List<Person> show() {
        return personService.findAll();
    }
}
