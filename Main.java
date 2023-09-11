/*Create an abstract class called "Vehicle" with abstract methods "start()" and "stop()". 
Create two subclasses "Car" and "Motorcycle" that extend the "Vehicle" class and implement the abstract methods. 
Write a Java program to demonstrate starting and stopping operations for a car and a motorcycle*/

abstract class Vehicle
{
	 abstract void start();     // Abstract method to start the vehicle
	 abstract  void stop();    // Abstract method to stop the vehicle
}
class Car extends Vehicle
{
	 void start()
	{
	 System.out.println("Car starting...");    // Implementation of start for a car
	}
	  void stop()
	{
	 System.out.println("Car stoping...");    // Implementation of stop for a car
	}
}
class Motorcycle extends Vehicle
{
	void start()
	{
	 System.out.println("Motorcycle starting...");    // Implementation of start for a motorcycle
	}
	 void stop()
	{
	 System.out.println("Motorcycle stopping...");   // Implementation of stop for a motorcycle
	} 
}
public class Main
{
	public static void main(String args[])
	{ 
	 Car car = new Car();
	 car.start();
       	 car.stop();

	Motorcycle motorcycle = new Motorcycle();
	 motorcycle.start();
                 motorcycle.stop();

	}
}