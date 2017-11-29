package com_gmail_chirka_andriy;

import java.util.Arrays;
import java.util.Scanner;

public class Group {

	public Student[] arr = new Student[10];

	public Group() {
		super();
	}

	public void addStudent(Student info) throws FullException {

		if (info == null) {
			throw new IllegalArgumentException("No informaation of student");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = info;
				return;
			}
		}

		throw new FullException();

	}

	public void interAddStudent() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of student: ");
		String name = sc.nextLine();
		System.out.println("Enter surname of student: ");
		String surname = sc.nextLine();
		System.out.println("Enter nationality of student: ");
		String nationality = sc.nextLine();
		System.out.println("Enter age of student: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("Enter weight of student: ");
		double weight = sc.nextDouble();
		System.out.println("Enter speciality of student: "); //Ошибка
		String speciality = sc.nextLine();
		System.out.println("Enter faculty of student: ");
		String faculty = sc.nextLine();
		System.out.println("Enter institute of student: ");
		String institute = sc.nextLine();
		System.out.println("Enter course of student: ");
		int course = sc.nextInt();

		try {
			this.addStudent(
					new Student(name, surname, nationality, age, weight, speciality, faculty, institute, course));

		} catch (FullException e) {
			System.out.println(e.getMessage());
		}

	}

	public void delStudent(Student info) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == info) {
				arr[i] = null;
				return;
			}
		}

	}

	public Student search(String surename) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].getSurename() != null && arr[i].getSurename().equalsIgnoreCase(surename)) {
				return arr[i];
			}
		}
		return null;
	}

	public void sortStudent() {
		Arrays.sort(arr, (a, b) -> (a == null || b == null) ? 1 : a.getSurename().compareTo(b.getSurename())); // ошибка

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				sb.append(arr[i].toString());
			}
		}
		return "Group: " + sb.toString();
	}
	
	 
	    public Student[] registration() {
		 int count = 0;
	        for(int i =0;i<arr.length;i++){
	            if(arr[i].getAge()>=18){
	                count++;
	            }
	        }
	        Student militaryArray[] = new Student[count];
	        for(int i =0;i<arr.length;i++){
	            if(arr[i].getAge()>=18){
	                militaryArray[i]=arr[i];
	            }
	        }
	        return militaryArray;
	    }

}
