package com.girish.Phonebook.Exception;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.Data;

@Data
public class ExceptionMessage {
	
	private String errorcode;
	private String msg;
	private LocalDateTime localDateTime;

}
