package q1;

public class ReverseString {

	public static void main(String[] args) {
		
		
		/*
		 * Question 
		 * 
		 * Reverse a string
		 * Difference between String class and StringBuffer class
		 */
		
		String text = "Selenium";
		
		
		System.out.println("************Method 01 - For Loop**********");
		
		/*
		 * String class is immutable
		 * this means you cannot change the objects created from string class
		 * therefore you cannot modify the test object and get the reverse 
		 * use for loop as a solution
		 */
		
		int len= text.length();//8
		
		String tt = "";
		
		for(int i=len-1;i>=0;i--) {
			
			tt = tt + text.charAt(i);
			
		}
		
		System.out.println(tt);
		
		
		System.out.println("************Method 02 - StringBuffer class**********");
		
		/*
		 * StringBuffer is a immutable
		 * meaning, you can modify the StringBuffer object
		 * StringBuffer class has reverse() method to to modify the object and get the reverse string
		 * 
		 */
		
		StringBuffer sb = new StringBuffer(text);
		System.out.println(sb.reverse());
	}

}
