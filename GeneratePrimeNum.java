//WAP to generate prime numbers between 1 and 100

public class  GeneratePrimeNum
  {
	 
	public static void main(String args[] )
	{

	 boolean  isPrime= false ;  //variable Declaration
	 int num, i ;
	System.out.println("Prime numbers between 1 and 100:");

	for(num = 2; num<=100; num++)
	{
	   isPrime = true ;
	   
                // Check if the num is divisible by any integer from 2 to itself-1  
	  for( i = 1 ; i <= num ; i++)
	  {  
	        
	     if( num % i==0)
	      {
 	          isPrime = false;
	           //break; 					
	      }
	  }
	  		
	 // If the number is not divisible by any integer other than 1 and itself, it's prime
	if( isPrime)
	 {
	  System.out.print(num + " ");
	}
            }
       }
  }
	 