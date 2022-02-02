package com.classboxes.classboxesproject;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.classboxes.classboxesproject.dao.Customer;
import com.classboxes.classboxesproject.service.BankingMenuService;

@SpringBootApplication
public class ClassboxesprojectApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext container = SpringApplication.run(ClassboxesprojectApplication.class, args);
	BankingMenuService bankingMenuService = container.getBean(BankingMenuService.class);
	/*List<Customer> customerList = bankingMenuService.getCustomers();	
	customerList.forEach((customer)->System.out.println(customer.getCust_Id()+"\t"+customer.getFirstName()+"\t"+customer.getLastName()+"\t"+customer.getPassword()+"\t"+customer.getPhoneNumber()+"\t"+customer.getEmail()));
	*/
	/*Optional<Customer> cust = bankingMenuService.findCustomerById(20);
	if(cust.isPresent()){
		Customer customer = cust.get();
System.out.println(customer.getCust_Id()+"\t"+customer.getFirstName()+"\t"+customer.getLastName()+"\t"+customer.getPassword()+"\t"+customer.getPhoneNumber()+"\t"+customer.getEmail());
	}
	Scanner sc = new Scanner(System.in);
	Customer cust = new Customer();
	System.out.println("enter cust id");
	cust.setCust_Id(sc.nextInt());
	System.out.println("enter cust firstname");
	cust.setFirstName(sc.next());
	System.out.println("enter cust lastname");
	cust.setLastName(sc.next());
	System.out.println("enter cust password");
	cust.setPassword(sc.next());
	System.out.println("enter cust phonenumber");
	cust.setPhoneNumber(sc.nextInt());
	System.out.println("enter cust email");
	cust.setEmail(sc.next());
	Customer customer = bankingMenuService.addCustomer(cust);
	System.out.println(customer.getCust_Id()+"\t"+customer.getFirstName()+"\t"+customer.getLastName()+"\t"+customer.getPassword()+"\t"+customer.getPhoneNumber()+"\t"+customer.getEmail());	
  */
	}

}
