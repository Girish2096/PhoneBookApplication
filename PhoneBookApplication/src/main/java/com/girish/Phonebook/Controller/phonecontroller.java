package com.girish.Phonebook.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.girish.Phonebook.Model.ContactBook;
import com.girish.Phonebook.Service.PhonebookServiceI;

@RestController
public class phonecontroller {
     
	@Autowired
	private PhonebookServiceI phonebookServiceI;
	
	@PostMapping(value="/contact",consumes="application/json")
	public ResponseEntity<String> save(@RequestBody ContactBook cb)
	{
		
		Boolean save = phonebookServiceI.save(cb);
		if(save)
		{
		String msg="save to db successfull";
		return new ResponseEntity<>(msg,HttpStatus.OK);
		}
		String msg1="not save to db successfull";
		
		return  new ResponseEntity<>(msg1,HttpStatus.BAD_REQUEST); 
		
		
	}
	
	
}
