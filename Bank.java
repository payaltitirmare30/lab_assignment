/*Create a bank class with withdraw and deposit methods.
assign balance amount and perform the said Operations
*/
import java.util.Scanner;

class Bank
 {

    	  double balance= 50000 ;
	 double amount ;
      	Scanner sc = new Scanner(System.in);
	
	 System.out.println("Enter the amount to withdraw ");
	  amount = sc.nextDouble();

	public void withdraw()
	{
	   if ( amount > 0 && amount <=balance )
	    {
	        balance = balance - amount;
	     System.out.println("withdraw successfully ");
	    }
	else
	  {
	   System.out.println("Insufficient balance");
	 }
	} 

	public void deposit()
	{
	    System.out.print("Enter the amount to deposit: ");
	    amount = sc.nextDouble();
	     if(amount > 0)
	    {
	       balance = balance + amount;
	       System.out.print("Deposit successfully ");
	        System.out.print("your total balance is : "+ balance);
	    }
	   else 
	   {
	     System.out.println("Invalid deposit amount ");
	    }
	  
	} 

	public static void main(String args[])
	{
	  Bank bank = new Bank();
	
	   bank.withdraw();
	 
	 }

}