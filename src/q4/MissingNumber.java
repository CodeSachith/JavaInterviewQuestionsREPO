package q4;

public class MissingNumber {

	public static void main(String[] args) {

/*
 * how to find missing value in the array
 */
		int a[] = {-1,0,1,2,4,5,6,7,8};
		
		int sum = 0;
		
		for(int i=0;i<a.length;i++) {
			
			sum = sum + a[i];
		}
		
		System.out.println(sum);
		
		
		int sum1 = 0;
		
		for(int j=-1;j<=8;j++) {
			
			sum1 = sum1 + j;
		}
		
		System.out.println(sum1);
		
		
		System.out.println("MIssing value is : "+ (sum1-sum));
		

	}

}
