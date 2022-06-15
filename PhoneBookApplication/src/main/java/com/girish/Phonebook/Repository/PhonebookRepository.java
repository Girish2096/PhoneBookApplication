package com.girish.Phonebook.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.girish.Phonebook.Model.ContactBook;

@Repository
public interface PhonebookRepository extends JpaRepository<ContactBook, Serializable> {

	Boolean findbyNumber(Integer contactNumber);

	
}
