package com.girish.Phonebook.Service;

import com.girish.Phonebook.Model.ContactBook;

public interface PhonebookServiceI {
	
	public Boolean save(ContactBook contactbook);
	
	public Boolean getnumber(Integer contactNumber);
	
	

}
