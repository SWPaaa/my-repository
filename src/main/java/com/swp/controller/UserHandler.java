package com.swp.controller;

import com.swp.entity.User;
import com.swp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserHandler {
    @Autowired
    private UserService userService;

    @GetMapping("/findAll")//http://localhost:8080/user/findAll
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("indexoof");
        modelAndView.addObject("list",userService.findAll());
        return modelAndView;
    }
    @GetMapping("findById/{id}")
    public ModelAndView findById(@PathVariable("id") Integer id){//获取id
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("update");//跳转到修改页面
        modelAndView.addObject("user",userService.findById(id));//传入id
        return modelAndView;
    }
    @PostMapping("/save")
    public String save(User user){
        userService.save(user);
        return "redirect:/user/findAll";//插入后跳转回主页面
    }
    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") Integer id){
        userService.deleteById(id);
        return "redirect:/user/findAll";//删除后跳转回主页面
    }
    @PostMapping("/update")
    public String update(User user){
        userService.update(user);
        return "redirect:/user/findAll";//修改后跳转回主页面
    }
}
