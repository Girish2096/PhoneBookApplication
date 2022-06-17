package com.girish.Phonebook.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.girish.Phonebook.Exception.NotDatafoundException;
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
		String msg1="not save to db ";
		
		return  new ResponseEntity<>(msg1,HttpStatus.BAD_REQUEST); 
		
		
	}
	
	/*
	 * @GetMapping(value ="/number/{contactNumber}",produces = "application/json")
	 * public ResponseEntity<String> getNumber(@PathVariable long contactNumber) {
	 * Boolean getnumber = phonebookServiceI.getnumber(contactNumber); if(getnumber)
	 * { String msg="number is found "; return new
	 * ResponseEntity<>(msg,HttpStatus.OK); } String
	 * msg1="number is not found  in db";
	 * 
	 * return new ResponseEntity<>(msg1,HttpStatus.BAD_REQUEST);
	 * 
	 * }
	 */
	
	
	@GetMapping(value="/getallcontacts",produces="application/json")
	public ResponseEntity<List<ContactBook>> getallcontacts()
	{
		 List<ContactBook> contacts = phonebookServiceI.getall();
		if(contacts!=null)
		{
			return new ResponseEntity<List<ContactBook>>(contacts, HttpStatus.OK);
		}
		else
		{
		  throw new  NotDatafoundException("contacts not found");
		}
			
		
	}

	
	@GetMapping("/getid/{contactId}")
	public ResponseEntity<ContactBook> getcontactid(@PathVariable Integer contactId)
	{
		ContactBook getbyid = phonebookServiceI.getbyid(contactId);
		if(getbyid!=null)
		{
			return new ResponseEntity<ContactBook>(getbyid, HttpStatus.OK);
		}
			String msg="not found id";
		return new ResponseEntity(msg,HttpStatus.BAD_REQUEST);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
