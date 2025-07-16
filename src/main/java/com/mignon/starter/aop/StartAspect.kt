package com.mignon.starter.aop

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut
import org.springframework.stereotype.Component


@Component
@Aspect

class StartAspect {


    @Pointcut("@annotation(org.springframework.web.bind.annotation.RestController)||@within(org.springframework.web.bind.annotation.RestController)")
    public fun runnerController(): Unit{}


    @Before(value = "runnerController()")
    public fun controller(pj: JoinPoint): Unit{
        println("============${pj.signature.name}=============")
    }
}