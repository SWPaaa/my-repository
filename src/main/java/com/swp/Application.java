package com.swp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//要把hellohandler文件放到这个启动文件的父类下才能被检索到（默认）
public class Application {
    public static void main(String[] args) {

        SpringApplication.run(Application.class,args);
    }
}
