package com.mignon.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;


/**
 * @author Mignon
 * @apiNote Spring Boot的启动类
 * @see SpringApplication
 */
@EnableAsync
@SpringBootApplication
@EnableAspectJAutoProxy
public class AppRun {
    public static void main(String[] args) {
        SpringApplication.run(AppRun.class, args);
    }

}
