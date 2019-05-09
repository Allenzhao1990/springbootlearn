package com.itLearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhaowei on 2019/5/8.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/helloworld")
    @ResponseBody
    public String hello(){
        return "Hello World !";

    }




}
