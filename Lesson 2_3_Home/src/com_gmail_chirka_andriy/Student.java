package com_gmail_chirka_andriy;

public class Student extends Human {

	private String speciality;
	private String faculty;
	private String institute;
	private int course;

	public Student(String name, String surename, String nationality, int age, double weight, String speciality,
			String faculty, String institute, int course) {
		super(name, surename, nationality, age, weight);
		this.speciality = speciality;
		this.faculty = faculty;
		this.institute = institute;
		this.course = course;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [Name=" + getName() + ", Surename=" + getSurename() + ", Speciality=" + getSpeciality()
				+ ", Faculty=" + getFaculty() + ", Institute=" + getInstitute() + ", Course=" + getCourse()
				+ ", Nationality=" + getNationality() + ", Age=" + getAge() + "]" + '\n';
	}

}
