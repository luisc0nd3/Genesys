package com.mycompany.dto;

public class PersonDTO {
	private String name;
	private Byte age;
	private Character sex;
	private String email;
	private String phone;
	private Double height;
	private Double weights;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Byte getAge() {
		return age;
	}
	public void setAge(Byte age) {
		this.age = age;
	}
	public Character getSex() {
		return sex;
	}
	public void setSex(Character sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getWeight() {
		return weights;
	}
	public void setWeight(Double weights) {
		this.weights = weights;
	}
	
	@Override
	public String toString() {
		return "PersonDTO [name=" + name + ", age=" + age + ", sex=" + sex + ", email=" + email + ", phone=" + phone
				+ ", height=" + height + ", weights=" + weights + "]";
	}
	
//	java 8 primitivos
//	byte var = null
//	short 
//	int Integer
//	long Longer
//	
//	boolean
//	
//	char
//	float
//	String	
}