package com.springboot.Exception;

import com.springboot.practice1.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerGlobal {

    @ExceptionHandler(value= InvalidStudentInfoException.class)
    public ResponseEntity<Object> InvalidStudentInfo(InvalidStudentInfoException  invalidStudentInfoException){
        ErrorMessage errorMessage=ErrorMessage.builder()
       // return ErrorMessage.builder()
                .message("Invalid Student Info ")
                .status(HttpStatus.BAD_REQUEST.toString())
                .dateTime(System.currentTimeMillis())
                .build();
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }
}
