//WAP a program to reverse a given String without using reverse() method.
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string ");
		str = sc.nextLine();
		System.out.println("Before reversed String  is :"+ str );		
		
	          // Initialize an empty string to store the reversed result.	
		String reverse=" ";  
		
		for(int i=str.length()-1; i>=0; i--)
		{
		       reverse = reverse +str.charAt(i);  //adding character to reverse string
		}
		
		System.out.println("After reversed String is :"+ reverse );				
	}
}
