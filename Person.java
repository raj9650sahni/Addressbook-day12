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
	

	public Person(String name, String age, String email, String address, String phone, String zipcode, String state,
			String city) {

		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.zipcode = zipcode;
		this.state = state;
		this.city = city;
		;

	}


	public void setCity(String city) {
		this.city = city;

	}

	public void setAddress(String address) {
		this.address = address;

	}

	public void setState(String state) {
		this.state = state;

	}

	public void setAge(String age) {
		this.age = age;

	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;

	}

	public void setPhone(String phone) {
		this.phone = phone;

	}

	public void setEmail(String email) {
		this.email = email;

	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public String getState() {
        return state;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", age=" + age + ", email='" + email + '\'' + ", phone='" + phone
				+ '\'' + ", address='" + address + '\'' + ", zipcode='" + zipcode + '\'' + ", state='" + state + '\''
				+ ", city='" + city + '\'' +

				'}';
	}

}
