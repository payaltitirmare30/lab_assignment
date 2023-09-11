/*
WAP to check whether the person is eligible for getting loan or not.
Condition to grant loan is he should have salary more than 50000 and He should be citizen of INDIA.Otherwise Loan can't be given to customer.
*/
import java.util.Scanner;     //importing Scanner classs

public class EligibleForLoan
 {

              public static void main(String args[] )
	 { 
                         int sallary ;
 	         String country;
                           
	   Scanner sc = new Scanner(System.in);

	  // Prompting the user to enter their country name and sallary
	  System.out.println("Enter Your Country Name In Capital (e.g., INDIA):  ");
	   country = sc.nextLine();      
	 
	 System.out.println("Enter Your Sallary ");
	   sallary = sc.nextInt();

	 // Checking if the salary is greater than 50000 and the country is "INDIA"
	  if(sallary > 50000  && country.equals("INDIA"))
	      {
	           System.out.println("Congratulations !! You are eligible for a  Loan  ");    											
                       }
	  else
	      {   
	         System.out.println(" Sorry!! your sallary "+ sallary + " is less than 50000, So You are not eligible for a loan .");
	      }
	        sc.close();

                }
  }	


 
   