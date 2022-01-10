package com.in28minutes.demo2.entity;

public class Customer {
	private long id;
	private String name;
	private String gender;
	private int age;
	private String prefFood;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String gender, int age, String prefFood) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.prefFood = prefFood;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPrefFood() {
		return prefFood;
	}
	public void setPrefFood(String prefFood) {
		this.prefFood = prefFood;
	}
	
	
	

}
