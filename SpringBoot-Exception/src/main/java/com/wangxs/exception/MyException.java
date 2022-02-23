package com.wangxs.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Desc
 * @Author wangxs
 * @CreateTime 2022/2/23
 */
@ControllerAdvice
public class MyException {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String showExe() {
        System.out.println("进入showExe控制器里...");
        return "出错了，别着急，马上解决！";
    }
}

