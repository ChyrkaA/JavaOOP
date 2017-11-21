package com_gmail_chirka_andrey;

public class Main {

	public static void main(String[] args) {
		
		Point center = new Point(0, 9);
		
		Round round = new Round(center, new Point(3,5));
		System.out.println("Round:");
        System.out.println(round.Area());
        System.out.println(round.Perimetr());
        System.out.println();
        
        Square square = new Square(new Point(1,1),new Point(2,2),new Point(3,3),new Point(4,4));
        System.out.println("Rectangle:");
        System.out.println(square.Area());
        System.out.println(square.Perimetr());
        System.out.println();
        
        Triangle triangle = new Triangle(new Point (0,0), new Point (1,1), new Point (6,0));
        System.out.println("Triangle:");
        System.out.println(triangle.Area());
        System.out.println(triangle.Perimetr());
        System.out.println();
        
	}

}
