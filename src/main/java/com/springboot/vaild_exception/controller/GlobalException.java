package com.springboot.vaild_exception.controller;


import javax.xml.bind.ValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> allException(String ex){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("예상번호가 +1 더 높습니다.");
    }

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<String> handleException(String ex){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("예상번호가 +1 더 높습니다.");
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> run(String ex){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("예상번호가 +1 더 높습니다.");
    }


}
