package com.java8.Q2.model.persistence;

import java.util.List;

import com.java8.Q2.model.exceptions.*;

public interface CustomerDao {
	public List<Customer> getAllCustomers() throws DataAccessException;
	public Customer getCustomerById(int id) throws CustomerNotFoundException,DataAccessException;
	public void addCustomer(Customer customer) throws DataAccessException;
	public void updateCustomer(Customer customer) throws DataAccessException;
	public void removeCustomer(int id) throws DataAccessException;

}
