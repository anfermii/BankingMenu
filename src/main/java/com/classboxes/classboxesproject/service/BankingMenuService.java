package com.classboxes.classboxesproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.classboxes.classboxesproject.dao.Account;
import com.classboxes.classboxesproject.dao.Customer;
import com.classboxes.classboxesproject.dao.IBankingMenuDAO;
import com.classboxes.classboxesproject.dao.IBankingMenuDAO2;

@Component
public class BankingMenuService implements IBankingMenuService{
  
	@Autowired
	IBankingMenuDAO ibm;
	@Autowired
	IBankingMenuDAO2 ibk;
	@Override
	public List<Customer> getCustomers() {
		
		return ibm.findAll();
	}
	@Override
	public Optional<Customer> findCustomerById(int cust_Id) {
		
		return ibm.findById(cust_Id);
	}
	@Override
	public Customer addCustomer(Customer cust) {
		return ibm.save(cust);
	}
	@Override
	public List getAccounts() {
		return ibk.findAll();
	}
	@Override
	public Optional findAccountById(int acc_Num) {
		
		return ibk.findById(acc_Num);
	}
//	public Account addAccount(Account acc) {
//	
//		return ibk.save(acc);
//	}
	@Override
	public Account addBankAccount(Account acc) {
		// TODO Auto-generated method stub
		return ibk.save(acc);
	}
	

	
	
}
