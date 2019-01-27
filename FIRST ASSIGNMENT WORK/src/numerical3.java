//Assignment 1 --> Problem 3.
//Cyclic Rotation --> Right Shift Operators. 
import java.util.Arrays; 

public class numerical3 {

        	   /*   Following are steps.
 	           1) Store last element in a variable say x.
	           2) Shift all elements one position ahead.
	           3) Replace first element of array with x. 
	           4) Right Shift By 1. */

	
	static int arr[] = new int[]{3,8,9,7,6}; 
    
    // Method for rotation 
    static void rotate() 
    { 
    	int x = arr[arr.length-1], i; 
        for (i = arr.length-1; i > 0; i--) 
           arr[i] = arr[i-1]; 
        arr[0] = x; 
     
    } 
	public static void main(String[] args) {
		
		
		{ 
	        System.out.println("Given Array is"); 
	        System.out.println(Arrays.toString(arr)); 

	          
	        rotate(); 
	          
	        System.out.println("Rotated Array is");
	        System.out.println(Arrays.toString(arr)); 

	    } 
		

}
	}
