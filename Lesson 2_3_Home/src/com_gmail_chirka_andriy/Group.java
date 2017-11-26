package com_gmail_chirka_andriy;

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
			if (arr[i] != null && arr[i].getSurename() != null) {
				return arr[i];
			}
		}
		return null;
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

}
