package com.Calculator;

import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Shape s = null;
		
		System.out.println("-----Area Calculator-----");
		System.out.println("Circle");
		System.out.println("Triangle");
		System.out.println("Rectangle");
		System.out.println("Ellipse");
		System.out.println("Trapezium");
		System.out.println("Parallelogram");
		System.out.println("Rhombus");
		System.out.println("Square");
		
		System.out.println("Enter choice: ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Enter radius: ");
			s = new Circle(sc.nextInt());
			
		} else if(choice ==2) {
			System.out.println("Enter base and height: ");
			s = new Triangle(sc.nextInt(), sc.nextInt());
		}  else if (choice == 3) {
            System.out.print("Enter length and breadth: ");
            s = new Rectangle(sc.nextInt(), sc.nextInt());

        } else if (choice == 4) {
            System.out.print("Enter a and b: ");
            s = new Ellipse(sc.nextInt(), sc.nextInt());

        } else if (choice == 5) {
            System.out.print("Enter a, b and height: ");
            s = new Trapezium(sc.nextInt(), sc.nextInt(), sc.nextInt());

        } else if (choice == 6) {
            System.out.print("Enter base and height: ");
            s = new Parallelogram(sc.nextInt(), sc.nextInt());

        } else if (choice == 7) {
            System.out.print("Enter d1 and d2: ");
            s = new Rhombus(sc.nextInt(), sc.nextInt());

        } else if (choice == 8) {
            System.out.print("Enter side: ");
            s = new Square(sc.nextInt());

        } else {
        	System.out.println("Invalid choice");
        	return;
        }
		System.out.println("Area = " + s.disp());
	}
}
