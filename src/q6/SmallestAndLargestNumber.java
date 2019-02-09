package q6;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		
		/*
		 * Find the smallest and the largest number in an array
		 */
		
		int a[] = {5,20,3,10,69,40,-8,-4,0,100,93,100,40,200};

		int largest = a[0];
		int smallest = a[0];
		
		//time complexity = O(n)
		
		for(int i = 1;i<a.length;i++) {
			if(a[i]>largest) {
				largest = a[i];
			}
			else if(a[i]<smallest) {
				smallest = a[i];
				
			}
		}
		
		System.out.println("\nArray is : "+Arrays.toString(a));
		System.out.println("Largest Value is : "+ largest);
		System.out.println("Smallest Value is : "+ smallest);
	}

}
