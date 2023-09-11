//WAP to check whether the Entered number is prime number or not

import java.util.Scanner;

class  CheckPrimeNumber
{
	public static void main(String args[]) {

		int num;
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any  number :");
		num = sc.nextInt();

		if (num == 0 || num == 1)
	                      {
		         System.out.println(num + " is not a prime number");  //0 and 1 are not prime
		    }
	                  else {

		          for (int i = 2; i <= num / 2; i++) {
	                            // If the number is divisible by i, it is not prime
			   if (num % i == 0) {
			       System.out.println(num + " is not a prime number");
			       isPrime = false;
			        break;  // if num is prime break the loop 
			}
		        }

		     if (isPrime) {
			          System.out.println(num + " Is prime number ");  // isPrime is true then print num
			    }
		}
		sc.close();
	}
}
	 