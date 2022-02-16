package com.java8.Q2.web.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.java8.Q2.model.persistence.Customer;
import com.java8.Q2.model.service.*;

public class CustomerMain {
	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();

		
		customerService.addCustomer(new Customer("Raj", "Delhi", "8484848391", Date.valueOf("2002-03-22")));
//		customerService.addCustomer(new Customer("Naman", "Mumbai", "7533623894", Date.valueOf("2020-09-12")));
//		customerService.addCustomer(new Customer("Nidhi", "Agra", "5357854323", Date.valueOf("2021/04/11")));
		
		List<Customer> customers = new ArrayList<>();
		customers = customerService.getAllCustomers();
		for(Customer customer: customers) {
			System.out.println(customer);
	}
		
//		customerService.getCustomerById(2);
	
	
	}
	

}
