
// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.Scanner;      //importing Scanner classs

public class   EvenOddSumCalculator
 {
	public static void main(String args[])
	{
	      int num , sum_even=0, sum_odd=0;   // declaration of variable 
 	      char ans ;
	      Scanner sc = new Scanner(System.in);     

	 // Start of the do-while loop for reading numbers and calculating sums
 	do {

	           System.out.println("Enter a positive  number " );    //taking integer num from user
	            num = sc.nextInt();
	      	 	
 	            // Checking if the number is even or odd and updating the corresponding sum
	          if(num %2==0)
	             {
	                  sum_even = sum_even + num;    
                               }
	         else
	             {
	                sum_odd= sum_odd + num;
	             }
 	 
	                System.out.println("Do you want to continue? (y / n) :");   //taking character input yes or no
	                 ans = sc.next().charAt(0);
	
	 }  while (ans == 'y' || ans == 'Y') ;
	 
	       System.out.println("sum of even numbers is : " +sum_even );  //printing even number sum

   	       System.out.println("sum of odd numbers is : " +sum_odd);      //printing odd number sum
	   
           }

 }