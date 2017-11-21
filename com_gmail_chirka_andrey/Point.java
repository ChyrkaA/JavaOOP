package com_gmail_chirka_andrey;

public class Point {

	double x;
	double y;
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double dist(Point b) {
		return Math.sqrt(Math.pow((this.x-b.getX()), 2)+Math.pow((this.x-b.getX()), 2));
	}

}
