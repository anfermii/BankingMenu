package com.classboxes.classboxesproject.action;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classboxes.classboxesproject.dao.Customer;
import com.classboxes.classboxesproject.service.IBankingMenuService;
import com.project.Account;

@RestController
@RequestMapping("/banking")
public class BankingMenuController {
 @Autowired
 IBankingMenuService ibmService;
 
 // CUSTOMER Rest Api
 @GetMapping("/customers")
	List<Customer> getCustomers(){
		return ibmService.getCustomers();	
	}
 @GetMapping("get/{cid}")
  Optional<Customer> findCustomerById(@PathVariable(name="cid") int cust_Id){
	return ibmService.findCustomerById(cust_Id);  
  }
 @PostMapping("/add")
 Customer addCustomer(@RequestBody Customer cust){
	return ibmService.addCustomer(cust);	 
 }
 // Account Rest Api
@GetMapping("/accounts")
 List<Account> getAccounts(){
	return ibmService.getAccounts();
 }
@GetMapping("/find/{aid}")
 Optional<Account> findAccountById(@PathVariable(name="aid") int acc_Num){
	return ibmService.findAccountById(acc_Num); 
 }
@PostMapping("/add")
Account addAccount(@RequestBody Account acc) {
	return (Account) ibmService.addAccount(acc);
	
}
 
}
