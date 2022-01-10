package com.in28minutes.demo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28minutes.demo2.entity.Customer;

import com.in28minutes.demo2.exception.ResourceNotFoundException;
import com.in28minutes.demo2.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repository;
	
	public Customer saveCustomer(Customer customer) {
	
		return repository.save(customer);
		
	}
	public List<Customer> saveCustomers(List<Customer> customer) {
		return repository.saveAll(customer);
		
	}
	public List<Customer> getCustomers(){
		return repository.findAll();
	}
	
    public Customer getCustomerById(Long id)  throws ResourceNotFoundException{
		
		return repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Customer","cusid",id));
	}
	public String deleteCustomer(long id) {
		
		repository.deleteById(id);
		return "customer deleted";
	}
	public Customer updateCustomer(Customer cust) {
		Customer  existCust=repository.findById(cust.getId()).orElseThrow(() -> new ResourceNotFoundException("Customer","custid",cust.getId()));
		existCust.setName(cust.getName());
		existCust.setGender(cust.getGender());
		existCust.setAge(cust.getAge());
		existCust.setPrefFood(cust.getPrefFood());
				
		return repository.save(existCust);
	}

}
