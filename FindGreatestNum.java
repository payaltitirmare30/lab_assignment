//WAP to find Greatest among three number using Nested if

import java.util.Scanner;   

public class FindGreatestNum
 {

              public static void main(String args[] )
	 {

	 int num1, num2, num3;                // variable declaration 
	 
 	 Scanner sc = new Scanner(System.in);       

 	  System.out.println("Enter First Number ");
	   num1 = sc.nextInt();
	  System.out.println("Enter Second Number");
	    num2 = sc.nextInt();
	  System.out.println("Enter Third Number ");
	      num3 = sc.nextInt();
	
	 // Using nested if statements to find the greatest number
	 if( num1 > num2)
	  {     
	         // If num1 is greater than num2, then check if it's greater than num3
                      if ( num1 > num3)
	         {
 	             System.out.println(num1+" Is greatest number ");
	         }
	      else
	       {  
	           // If num1 is not greater than num3, then num3 is the greatest
	           System.out.println(num3+" Is greatest number ");
	        }
                   }
                 else 
	  {        // If num1 is not greater than num2, then check if num2 is greater than num3
	            if(num2 > num3)
	           {
	               System.out.println(num2+" Is greatest number ");
	           }
	           else
	           {
	              // If num2 is not greater than num3, then num3 is the greatest
	              System.out.println(num3+" Is greatest number ");
	           }

	  }
            }
  }
	  