package com.mignon.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author Mignon
 * @apiNote Spring Boot的启动类
 * @see SpringApplication
 *
 * */
@SpringBootApplication

public class AppRun {

    public static void main(String[] args) {
        SpringApplication.run(AppRun.class, args);
    }

}
