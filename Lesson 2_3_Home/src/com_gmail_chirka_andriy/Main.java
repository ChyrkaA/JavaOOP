package com_gmail_chirka_andriy;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student Andriy = new Student("Andriy", "Chirka", "Ukr", 23, 85.3, "Java", "IT", "IIT", 5);
		Student Valerie = new Student("Valerie", "Kushtinec", "Ukr", 22, 50.2, "Java", "IT", "IIT", 5);
		Student Ira = new Student("Ira", "Soroka", "Ukr", 24, 55.3, "Java", "IT", "IIT", 5);
		Student Olexandr = new Student("Olexandr", "Pugach", "Ukr", 23, 80.3, "Java", "IT", "IIT", 5);
		Student Gleb = new Student("Gleb", "Kobzar", "Ukr", 24, 75.6, "Java", "IT", "IIT", 5);
		Student Anastasia = new Student("Anastasia", "Yarchuk", "Ukr", 24, 64.3, "Java", "IT", "IIT", 5);
		Student Svetlana = new Student("Svetlana", "Tihonova", "Ukr", 22, 51.1, "Java", "IT", "IIT", 5);
		Student Pavel = new Student("Pavel", "Tamerkin", "Ukr", 23, 75.8, "Java", "IT", "IIT", 5);
		Student Ruslan = new Student("Ruslan", "Domashevskiy", "Ukr", 22, 75.3, "Java", "IT", "IIT", 5);
		Student Yaroslav = new Student("Yaroslav", "Sokolovskiy", "Ukr", 23, 85.3, "Java", "IT", "IIT", 5);

		Group group = new Group();

		try {
			group.addStudent(Andriy);
			group.addStudent(Valerie);
			group.addStudent(Ira);
			group.addStudent(Olexandr);
			group.addStudent(Gleb);
			group.addStudent(Anastasia);
			group.addStudent(Svetlana);
			group.addStudent(Pavel);
			group.addStudent(Ruslan);
			group.addStudent(Yaroslav);

		} catch (FullException e) {
			e.printStackTrace();

		}

		System.out.println(group);
		
		group.delStudent(Gleb);
		System.out.println(group);
		System.out.println(group.search("Chirka"));

	}
}
