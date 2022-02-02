package com.classboxes.classboxesproject.service;

import java.util.List;
import java.util.Optional;

import com.classboxes.classboxesproject.dao.Customer;

public interface IBankingMenuService<Account> {
 List<Customer> getCustomers();
 Optional<Customer> findCustomerById(int cust_Id);
 Customer addCustomer(Customer cust);
 List<Account> getAccounts();
 Optional<Account> findAccountById(int acc_Num);
 Account addBankAccount(Account acc);
com.classboxes.classboxesproject.dao.Account addBankAccount(com.classboxes.classboxesproject.dao.Account acc);
}
