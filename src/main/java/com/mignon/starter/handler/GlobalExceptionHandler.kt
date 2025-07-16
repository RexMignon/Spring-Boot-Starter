package com.mignon.starter.handler

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.ErrorResponse
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice


/**
 * 全局异常返回器, 用于Controller层对参数Check抛出的MethodArgumentNotValidException异常
 * @author Mignon
 * */
@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun methodArgumentNotValidException(exception: MethodArgumentNotValidException):
            ResponseEntity<Map<String, String?>> {
        return ResponseEntity(exception.bindingResult.fieldErrors.associate {
            it.field to it.defaultMessage
        }, HttpStatus.BAD_REQUEST)
    }
}