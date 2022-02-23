package com.wangxs.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangxs.pojo.Person;
import com.wangxs.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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


    @RequestMapping("/showpage")
    @ResponseBody
    public ModelAndView showpage(Integer pageindex) {
        ModelAndView mv = new ModelAndView();

        if (null == pageindex) {
            // 开启分页
            PageHelper.startPage(1, 2);
        }else {
            PageHelper.startPage(pageindex, 2);
        }


        List<Person> list = personService.findAll();
        PageInfo<Person> pageInfo = new PageInfo<>(list);
        mv.addObject("pageinfo", pageInfo);
        return mv;
    }


    // 对Exception方法进行容错
//    @ExceptionHandler(Exception.class)
//    @ResponseBody
//    public String showException() {
//        return "请稍等，待会儿有工作人员联系您";
//    }
}
