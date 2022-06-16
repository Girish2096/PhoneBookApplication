package com.girish.Phonebook.Service;

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

	@Override
	public Boolean getnumber(Integer contactNumber) {
		
		Boolean findbyNumber = phonebookRepository.findbyNumber(contactNumber);
		if(findbyNumber!=null)
		{
			return true;
		}
		return false;
	}

}
