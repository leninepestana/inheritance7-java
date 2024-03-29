package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Shape rect = new Rectangle();
		//Shape circ = new Circle();
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			sc.nextLine();
			String color = sc.nextLine();
			if (ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				//rect = new Rectangle(Color.valueOf(color), width, height);
				list.add(new Rectangle(Color.valueOf(color), width, height));
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				//circ = new Circle(Color.valueOf(color), radius);
				list.add(new Circle(Color.valueOf(color), radius));
			}
				
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		//System.out.println(rect);
		//System.out.println(circ);
		for (Shape sh : list) {
			System.out.println(sh);
		}

	}

}
