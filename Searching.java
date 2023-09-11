/* Create package MyArray to accept 10 values from user.
import created package to find particular element from the array using binary search algorithm*/
import MyArray.BinarySearching;
import java.util.Scanner;
public class Searching
{
	public static void main(String[] args) {
		
		int[] a = new int[10];
		int key,i,j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 10 elements one by one ");		
		for( i=0; i<a.length; i++)
		{
		    a[i]= sc.nextInt();
		}
		 //sorting the array 
	           	   for (i = 0; i < a.length; i++) {
         		   for (j = i + 1; j < a.length; j++) {
     	                      if (a[i] > a[j]) {
                                           int temp = a[i];
                                          a[i] = a[j];
                                          a[j] = temp;
                                         }
                                      }
                                  }

		System.out.println("sorted array is:");
		for(i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("==========================");
		
		System.out.println("enter which element you want to find");
		key = sc.nextInt();
		//calling method and storing result
	                 int result = BinarySearching.searching(a, key);

                                  if (result != -1) {
                                     System.out.println("Element found at index " + result);
                                  } else {
                                    System.out.println("Element not found in Array");
                                }	   
	    }
 }
