//WAP to check Whether the number is Armstrong number or not
import java.util.Scanner;

class CheckArmstrong
{
	int num;
	int rem, temp,sum=0 ;

	Scanner sc = new Scanner(System.in);

	//method to accept number from user
	public void accept()
	{
	System.out.println("enter a number ");
	 num = sc.nextInt();
	}
	 //method to check number is armstrong or not 
	public void isArmstrong()
	{
	   temp = num ;  
	    while(num >0)
	    {
	     rem = num %10;     // Extract the last digit
	     sum = sum+rem*rem*rem;   // Cube the digit and add to sum
	     num = num /10;      // Remove the last digit
	     }

	// Compare the sum  with the original number
                   if( temp ==sum)
	   { 
	    System.out.println("it is armstrong number "); 
	   }
	  else
	  {
	   System.out.println("it is not armstrong number ");
	  }
           }
}

public class TestArmst
{

	public static void main(String args[])
	{
	 
	CheckArmstrong armstrong = new CheckArmstrong();
	armstrong.accept();
	armstrong.isArmstrong() ;
	
	}
}
	