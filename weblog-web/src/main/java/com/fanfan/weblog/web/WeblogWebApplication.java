package com.fanfan.weblog.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.fanfan.weblog.*"})//多模块项目中，必须手动指定扫描com.fanfan.weblog包下面的所有类，包含weblog-web\weblog-common模块
public class WeblogWebApplication {

    public static void main(String[] args) {

        SpringApplication.run(WeblogWebApplication.class, args);
    }

}
