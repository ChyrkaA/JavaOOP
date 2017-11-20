package homeWork;

public class Triangle {

	private int a;
	private int b;
	private int c;

	public Triangle(int a, int b, int c) {

		this.a = a;
		this.b = b;
		this.c = c;

	}

	public Triangle() {

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public double square() {
		if (this.a > this.b + this.c || this.b > this.a + this.c || this.c > this.b + this.a) {
			System.out.println("Triangle is wrong");
			return 0.0;
		} else {
			double square;
			int p;
			p = this.a + this.b + this.c;
			square = Math.sqrt(p / 2 * (p / 2 - this.a) * (p / 2 - this.b) * (p / 2 - this.c));
			return square;
		}
	}

	@Override
	public String toString() {
		return "Triangle: side A = " + a + ", side B = " + b + ", side C = " + c + ", square = " + square() + "]";
	}

}
