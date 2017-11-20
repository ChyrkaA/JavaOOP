package homeWork;

public class Cat {

	private String color;
	private String mood;
	private double weight;
	private int age;

	public Cat(String color, String mood, double weight, int age) {

		this.color = color;
		this.mood = mood;
		this.weight = weight;
		this.age = age;
	}

	public Cat() {
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Cat: color - " + color + "; mood - " + mood + "; weight - " + weight + " kg; age - " + age
				+ " year(s).";
	}

}
