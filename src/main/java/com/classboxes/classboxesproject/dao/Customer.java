package com.classboxes.classboxesproject.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="CUSTOMER")
public class Customer {
	    @Id
	    @Column(name="CUST_ID")
		private int cust_Id;
	    @Column(name="FIRSTNAME")
		private String firstName;
	    @Column(name="LASTNAME")
		private String lastName;
	    @Column(name="PASSWORD")
		private String password;
	    @Column(name="PHONENUMBER")
		private int phoneNumber;
	    @Column(name="EMAIL")
		private String email;
	    
		public int getCust_Id() {
			return cust_Id;
		}
		public void setCust_Id(int cust_Id) {
			this.cust_Id = cust_Id;
		}
	    
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
	}

