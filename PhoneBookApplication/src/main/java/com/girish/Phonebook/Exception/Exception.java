package com.girish.Phonebook.Exception;


import java.time.LocalDateTime;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Exception {
	
	@ExceptionHandler(value=NotDatafoundException.class)
	public ResponseEntity<ExceptionMessage> NotDataFoundException(NotDatafoundException n){
		
		ExceptionMessage e=new ExceptionMessage();
		e.setErrorcode("NDFE234");
		e.setMsg(n.getMessage());
		e.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity<>(e,HttpStatus.BAD_REQUEST);
		
		
	}
	
	

}
