package com.girish.Phonebook.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.girish.Phonebook.Model.ContactBook;
import com.girish.Phonebook.Repository.PhonebookRepository;

@Service
public class PhonebookServiceimp implements PhonebookServiceI {
	
	@Autowired
	private PhonebookRepository phonebookRepository;

	@Override
	public Boolean save(ContactBook contactbook) {
		
		ContactBook save = phonebookRepository.save(contactbook);
		if(save!=null)
		{
			return true;
		}
		return false;
				
	}

	/*
	 * @Override public Boolean getnumber(long contactNumber) {
	 * 
	 * Boolean findbyNumber = phonebookRepository.findByNumber(contactNumber);
	 * if(findbyNumber!=null) { return true; } return false; }
	 */

	
	
	public List<ContactBook> getall() {
		
		List<ContactBook> list = phonebookRepository.findAll();

		return list ;
	}

}
