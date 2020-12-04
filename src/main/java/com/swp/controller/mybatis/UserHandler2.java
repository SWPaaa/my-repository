package com.swp.controller.mybatis;

import com.swp.entity.User;
import com.swp.mybatis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/myuser")//http://localhost:8080/myuser/findAll
public class UserHandler2 {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll")
    public List<User> findAll(){
        System.out.print("111111111111111111");
        return userRepository.findAll();
    }
}
