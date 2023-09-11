//WAP to search given student name is available in the list of student name using String array.
import java.util.Scanner;

public class SearchList {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		 // Create a String array 
		String[] str = { "payal", "ram",  "sita", "durga", "mohan" };
				
		System.out.println("enter a name  you want to search ");
		String searchName = sc.nextLine().toLowerCase();  //taking input in lowercase
		
		boolean isAvailable = false;  // to check if the name is found.
		
		for(int i=0; i<str.length; i++)
		{
			if(searchName.equals(str[i]))  // check searchname is presnt in array
			{
				isAvailable = true;
				break;
			}		
		}

		if(isAvailable==true)
		{
			System.out.println(searchName +" Is available in the list");
		}
		else
		{
			System.out.println(searchName +" Is not available in the list ");
		}
	}
 }

