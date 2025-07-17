package com.mignon.starter.controller;


import com.mignon.starter.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WWenHai
 * @desc: 测试Controller
 * @date: 2025-07-15 15:48
 **/
@RestController
@RequestMapping("/t")
@RequiredArgsConstructor
@Slf4j
public class TestController {


        @GetMapping("/{id}")
    public String mySpringBootStart(
            @PathVariable Integer id
        ){
            System.out.println("id => "+id);
            return "hello SpringBoot";
        }




}
