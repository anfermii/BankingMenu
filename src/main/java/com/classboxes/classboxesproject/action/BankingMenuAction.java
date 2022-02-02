package com.classboxes.classboxesproject.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.classboxes.classboxesproject.dao.Customer;
import com.classboxes.classboxesproject.service.IBankingMenuService;

@Controller
@RequestMapping("/bank")
public class BankingMenuAction {
	@Autowired
	IBankingMenuService ibmService;
	
	@GetMapping("/login")
 public String login() {
	return "login"; 
 }
	@GetMapping("/cust")
 public String customer(Model model) {
		model.addAttribute("cust", new Customer());
	return "customer"; 
 }
	@PostMapping("/add")
	public String customerregs(Customer cust) {
		ibmService.addCustomer(cust);
		return "home";	
	}
}
