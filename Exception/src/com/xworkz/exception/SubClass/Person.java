package com.xworkz.exception.SubClass;

public abstract class Person {
	
	private String name;
	private int age;
	private String place;
	private boolean work;
	private int weight;
	
	abstract String eat();
	abstract boolean sleep();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public boolean isWork() {
		return work;
	}
	public void setWork(boolean work) {
		this.work = work;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
		
	}
	

}
