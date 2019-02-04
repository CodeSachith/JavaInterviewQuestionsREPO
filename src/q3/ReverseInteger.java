package q3;

public class ReverseInteger {

	public static void main(String[] args) {

		
		System.out.println("*********Method 1**********");
		int num = 123456789;//54321
		
		/*
		 * 1. Using Algo
		 */
		int rev = 0;
		
		while(num != 0) {
			
			rev = rev * 10 + num % 10;
			//System.out.println("rev : " + rev);
			num = num/10;
			//System.out.println("num : "+num);
		}
		
		System.out.println("Reverse Number is : " + rev);
	
		System.out.println("*********Method 2**********");
		/*
		 * 2. Using StringBuffer class
		 */
		
		int num2 = 123456789;//54321
		
		StringBuffer sb = new StringBuffer(String.valueOf(num2));
		System.out.println("Reverse Value : "+sb.reverse());
		

	}

}
