//WAP to swap two numbers without using third variable
import java.util.Scanner;

class SwapNum
{
	int num1, num2;
	
	Scanner sc = new Scanner(System.in);

	//method to accept two numbers from user
	public void accept()
	{
	 System.out.println("enter first numbers ");
	 num1 = sc.nextInt();
	  System.out.println("enter first numbers ");
	 num2 = sc.nextInt();
	 }

	// Method to swap two numbers without using a third variable
	 public void checkSwapping()
	 {
	  System.out.println("Before Swapping num1= "+num1+ " and num2= "+num2);
	   num1 = num1+num2;
	   num2 = num1 -num2;
	   num1 = num1-num2;
	 }
	 // Method to display the swapped numbers
	public void display()
	{
	  System.out.println("After Swapping num1= "+num1+ " and num2= "+num2);
	}
}

public class TestSwap
{
	public static void main(String args[])
	{
	 SwapNum swap = new SwapNum();
	
	 swap.accept();
	 swap.checkSwapping();
	 swap.display();

	}
}