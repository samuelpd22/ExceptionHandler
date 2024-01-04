package com.tratamentodeerros.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@Slf4j
@ControllerAdvice
public class ApplicationExceptionHandler  extends ResponseEntityExceptionHandler {

    @ExceptionHandler (NullPointerException.class)
    public ResponseEntity handlerException(Exception e ){
        log.info("caiu no handler");
        return new ResponseEntity("error" , HttpStatus.BAD_GATEWAY);
    }


}
