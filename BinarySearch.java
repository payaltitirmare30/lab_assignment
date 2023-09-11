/*WAP to accept array elements(input of 10 numbers) from user.and apply binary search to search parrticular element from that list*/
import java.util.Arrays;
import java.util.Scanner;
//binary search 
public class BinarySearch {

	// Method to perform binary search on the array a for the key
	 public static int searching(int[] a, int key)
                {
    	   int left=0, right=a.length-1, mid=0;
	     while(left<= right)
	     {   
	         mid= (left+right)/2;
	                if(key==a[mid])
	    	 {
	    	       return mid;    // Key found at index mid
	    	 }
	    	 else if(key< a[mid])
	    	 {
	    	       right =mid-1;    // Key might be on the left side
	    	 }
	    	 else
	    	 {
	    	       left=mid+1;    // Key might be on the right side
	    	 }
	     }
	             return -1;          // Key not found
    }
         }

	public static void main(String[] args) {
		
		int[] a = new int[5];
		int key;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 elements one by one ");
		
		for(int i=0; i<a.length; i++)
		{
			a[i]= sc.nextInt();
		}
		
		Arrays.sort(a);      // Sort the array in ascending order

	               /* for(i=0;i<a.length;i++)
		  {
		     for(j=i+1; j<a.length; j++)   
		    {
		       if(a[i] > a[j]){
	       	       temp = a[i];
	       	       a[i] = a[j];
	                       a[j] = temp;
	                    }
	                } */
		System.out.println("sorted array is:");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("==========================");
		
		System.out.println("enter which element you want to find");
		key = sc.nextInt();
		
	          int result = BinarySearch.searching(a, key);

                            if (result != -1) {
                                System.out.println("Element found at index " + result);
                            } else {
                                System.out.println("Element not found in Array");
                                }
	   
	    }
     }
