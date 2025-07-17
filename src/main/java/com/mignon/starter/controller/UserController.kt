package com.mignon.starter.controller

import com.mignon.starter.model.dto.UserDTO
import com.mignon.starter.service.UserService
import jakarta.validation.Valid
import lombok.RequiredArgsConstructor
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/kt")
class UserController(private val userService: UserService) {


    @PostMapping("/springboot")
    fun test(@Valid @RequestBody userDTO: UserDTO): String {
        println(userService.javaClass)
        userService.sayHello()
        println(userDTO.age)
        println(userDTO.name)
        println(userDTO.toString())
        return "Hello Spring Boot And Kotlin!"
    }


    @GetMapping("/{id}")
    fun getUserByIdAlias(@PathVariable id: Long): String {
        return "Fetching user with ID (alias): $id"
    }

}