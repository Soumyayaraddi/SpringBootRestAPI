package com.in28minutes.demo2.entity;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CustomerManager {
	
	Map<String,Customer> customerList=new ConcurrentHashMap<String,Customer>();
	
    public void addCustomer(String name,String gender,int age,String prefFood) {
		
		Customer customer=new Customer(name,gender,age,prefFood);
		validateCustomer(customer);
		customerList.put(generatedKey(customer), customer);
			
	}
    
    public Collection<Customer> getAllCustomer(){
    	return customerList.values();
    	
    }
	public void validateCustomer(Customer customer) {
		customer.validateAge();
		customer.validateName();
	}
	public String generatedKey(Customer customer) {
		return String.format("%s %s",customer.getName(),customer.getPrefFood());
	}
	

	

}
