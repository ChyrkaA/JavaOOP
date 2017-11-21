package com_gmail_chirka_andrey;

public class Round extends Shape {

	private Point o;
	private Point r;

	public Round(Point o, Point r) {
		super();
		this.o = o;
		this.r = r;
	}

	public Point getO() {
		return o;
	}

	public void setO(Point o) {
		this.o = o;
	}

	public Point getR() {
		return r;
	}

	public void setR(Point r) {
		this.r = r;
	}

	@Override
	public double Perimetr() {
		return 2 * Math.PI * o.dist(r);
	}

	@Override
	public double Area() {
		return Math.PI * Math.pow(o.dist(r), 2);
	}

}
