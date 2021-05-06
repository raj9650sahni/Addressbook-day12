package com.addressbok.model;

public class Person {
	 
	public String name;
	public String age;
	public String email;
	public String phone;
	public String address;
	public String zipcode;
	public String state;
	public String city;
	
	
	public Person(String name,String age,String email,String address,String phone,String zipcode,String state,String city) {
		
		this.name =  name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address =address;
		this.zipcode = zipcode;
		this.state= state;
		this.city = city;
;		
		
	}
	
	public String toString() {
		return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city+ '\'' +
                
                '}';
	}

}

