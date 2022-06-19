package com.girish.Phonebook.Service;

import java.util.List;

import com.girish.Phonebook.Model.ContactBook;

public interface PhonebookServiceI {
	
	public Boolean save(ContactBook contactbook);
	
 //	public Boolean getnumber(long contactNumber);
	
	public List<ContactBook> getall();

	public ContactBook getbyid(Integer contactId);

	public Boolean update(ContactBook contact);
	
	public Boolean deletebyid(Integer contactId);


	

}
