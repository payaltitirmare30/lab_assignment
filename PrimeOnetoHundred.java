//WAP to generate prime numbers between 1 and 100

class PrimeOnetoHundred {

       public static void main(String[] args) {
	
         System.out.println("Prime numbers between 1 to 100 are ");
	
        for (int i = 1; i <= 100; i++) {
         // If the number i is prime, print it 	
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

      // Function to check if a number is prime or not
      // Returns true if the number is prime, false otherwise
      public static boolean isPrime(int number) {

          if (number <= 1) {
              return false;  
         }

     // If the number is divisible by any i, it's not prime
        for (int i = 2; i <= number /2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;  // If no divisors found, the number is prime
    
    }
}