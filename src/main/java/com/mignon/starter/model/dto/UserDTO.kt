package com.mignon.starter.model.dto

import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank

data class UserDTO(
    @field:NotBlank(message = "姓名不能为空")
    val name:String,

    @field:Min(1, message = "年龄必须大于0")
    val age:Int
)