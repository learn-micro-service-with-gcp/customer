package com.rishabhsoft.customer.exception.handler;


import com.rishabhsoft.customer.dto.MessageDTO;
import com.rishabhsoft.customer.exception.InvalidUserLoginException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler
{
    @ExceptionHandler(InvalidUserLoginException.class)
    public ResponseEntity<MessageDTO> handleInvalidUserLoginException(InvalidUserLoginException invalidUserLoginException)
    {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new MessageDTO("Invalid User name or Password",HttpStatus.NOT_FOUND.name()));
    }
}
