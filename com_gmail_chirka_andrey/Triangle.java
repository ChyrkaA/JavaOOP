package com_gmail_chirka_andrey;

public class Triangle extends Shape {

	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	public double Perimetr() {
		return a.dist(b) + b.dist(c) + c.dist(a);
	}

	@Override
	public double Area() {
		return Math.sqrt((this.Perimetr() / 2) * ((this.Perimetr() / 2) - a.dist(b))
				* ((this.Perimetr() / 2) - b.dist(c)) * ((this.Perimetr() / 2) - c.dist(a)));
	}

}
