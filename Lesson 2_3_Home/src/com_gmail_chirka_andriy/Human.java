package com_gmail_chirka_andriy;

public class Human {

	private String name;
	private String surename;
	private String nationality;
	private int age;
	private double weight;

	public Human(String name, String surename, String nationality, int age, double weight) {
		super();
		this.name = name;
		this.surename = surename;
		this.nationality = nationality;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurename() {
		return surename;
	}

	public void setSurename(String surename) {
		this.surename = surename;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", surename=" + surename + ", nationality=" + nationality + ", age=" + age
				+ ", weight=" + weight + "]";
	}

}
