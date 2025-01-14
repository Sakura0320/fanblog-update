package com.fanfan.weblog.web;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import lombok.extern.slf4j.Slf4j;

/**
 * @auther:fanfan
 * date:2025
 */
@SpringBootTest
@Slf4j
class WeblogWebApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testLog(){
        log.info("这是一行info级别日志");
        log.warn("这是一行warn级别日志");
        log.error("这是一行error级别日志");

        //占位符
        String author = "fanfan";
        log.info("这是一行带有占位符的日志，作者：{}",author);
    }
}
