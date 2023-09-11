//Write a java program to capitalize each word in string.
import java.util.Scanner;

public class CapitalizeWord {

	public static void main(String[] args) {
		
		String str , capWord;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string ");
		str = sc.nextLine();
		
		 capWord = str.toUpperCase();  //UpperCase to make each word capital 
		
		System.out.println("After capitalize string is :"+ capWord);
	}

}
