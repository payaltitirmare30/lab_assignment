/* Create package MyArray to accept 10 values from user.
import created package to find particular element from the array using binary search algorithm*/

package MyArray;
public class BinarySearching
{
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
