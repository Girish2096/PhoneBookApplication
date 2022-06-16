package com.girish.Phonebook.Model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import lombok.Data;

@Data
@Entity
@Table(name="Contact_Dtls")
public class ContactBook {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Contact_ID")
	private Integer contactId;
	@Column(name="Contact_NAME")
	private String contactName;
	@Column(name="Contact_NUMBER")
	private long contactNumber;
	@Column(name="Contact_EMAIL")
	private String contactEmail;
	@Column(name="ACTIVE_SW")
	private Character activeSwitch;
	@CreationTimestamp
	@Column(name="CREATE_DATE")
	private LocalDate createdDate;
	@CreationTimestamp
	@Column(name="UPDATE_DATE")
	private LocalDate  updateDate;

}
