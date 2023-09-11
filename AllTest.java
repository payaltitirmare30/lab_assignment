/*Create a superclass called "Shape" with properties like "numSides" and "color". 
Create three subclasses "Triangle", "Square", and "Circle" that inherit from "Shape" and 
have additional properties like "sideLengths" for triangle and square, and "radius" for the circle. 
Write a Java program to display the details of a triangle, a square, and a circle. */
import java.util.Scanner;
class Shape
{
 	int numSides;
	String color;
	// Constructor to initialize properties
	 public Shape(int numSides, String color) {
                     this.numSides = numSides;
                     this.color = color;
                   }
}
class Triangle extends Shape
{
	int sideLength;
	
	 Triangle(int sideLength ,String color)
	{
	  super(3,color);    // Calling superclass constructor
	  this.sideLength= sideLength;
	 } 
	// Method to display triangle details
	void display()
	{
	  System.out.println("Triangle Details:");
                  System.out.println("Number of Sides: " + numSides);
                  System.out.println("Color: " + color);
	  System.out.println("The Side Length is : "+sideLength);
	}
}
class Square extends Shape
{
	
	int sideLength;
	
	 Square(int sideLength,String color )
	{
	  super(4,color);   // Calling superclass constructor
	 this.sideLength= sideLength;
	 } 
	// Method to display square details
	void display()
	{
	 System.out.println("Square Details:");
        	 System.out.println("Number of Sides: " + numSides);
       	 System.out.println("Color: " + color);
       	 System.out.println("Side Length: " + sideLength);
	 System.out.println("The Area of Square is : "+sideLength*sideLength);
	}
}
class Circle extends Shape
{
	double radius ;
	
	 Circle(double radius,String color)
	{
	 super(0,color);    // Calling superclass constructor
	 this.radius= radius;
	 } 
	 // Method to display circle details
	void display()
	{
	 System.out.println("Circle Details:");
        	 System.out.println("Number of Sides: " + numSides);
        	 System.out.println("Color: " + color);
                 System.out.println("Radius: " + radius);
	}
}

public class AllTest
{
	public static void main(String args[])
	{
	   int sideLength ;
	   String color;
	   double radius;
	   Scanner sc = new Scanner(System.in);
	    // Get triangle details from the user
	   System.out.println("-----------------------------------------------------");
	   System.out.println("Enter the sideLength of Triangle: ");
       	   sideLength = sc.nextInt();
        	   sc.nextLine(); // Consume the newline character        
        	   System.out.println("Enter the triangle color: ");
       	   color = sc.nextLine(); 

       	   Triangle tr = new Triangle(sideLength, color);
	   tr.display();
	   // Get square details from the user
       	   System.out.println("-----------------------------------------------------");
       	   System.out.println("Enter the sideLength of Square: ");
       	   sideLength = sc.nextInt();
        	   sc.nextLine(); // Consume the newline character
	   System.out.println("Enter the square color: ");
	   color = sc.nextLine();
	
        	   Square s = new Square(sideLength, color);
      	   s.display();
	   // Get circle details from the user
	   System.out.println("-----------------------------------------------------");
      	   System.out.println("Enter the Radius Of circle: ");
      	   radius = sc.nextDouble();
        	   sc.nextLine(); // Consume the newline character
      	   System.out.println("Enter the circle color: ");
      	   color = sc.nextLine();

      	   Circle c = new Circle(radius, color);
       	   c.display();
	}
}





