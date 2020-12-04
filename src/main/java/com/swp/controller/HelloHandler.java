package com.swp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloHandler {

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("indexoof");//setViewName指定跳转页面为/indexoof.jsp
        //addObject设置返回参数mess的值为Hello Spring Boot
        modelAndView.addObject("mess","Hello Spring Boot");
        return  modelAndView;
    }
}
