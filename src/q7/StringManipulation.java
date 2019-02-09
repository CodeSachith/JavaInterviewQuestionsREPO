package q7;

public class StringManipulation {

	public static void main(String[] args) {


		String str = "The Rain have started here";
		
		String str1 = "The rain have started here";
		/*
		 * size of the string array
		 */
		
		
		int a = str.length();
		
		System.out.println("Size of the array is : "+a);
		
		//Character at specifi index
		int pos = 5;
		System.out.println("Charactor at " + pos + " position is : "+str.charAt(5));
		
		//index of a particular character in the string array
		
		System.out.println("Index is : "+str.indexOf("e")); //index of 1st occurrence
		
		System.out.println("Index is : "+ str.indexOf("e", str.indexOf("e")+1)); //index of 2nd occurrence
		
		System.out.println("Index is : "+str.indexOf("e", str.indexOf("e", str.indexOf("e")+1)+1)); //index of 3rd occurrence
		
		System.out.println("Index is : "+str.indexOf("here"));
		
		System.out.println("Index is : "+str.indexOf("z")); //for non existing strings, it returns -1
		
		//string comparison
		
		System.out.println("Two strings are equal : "+str.equals(str1));

		System.out.println("Two strings are equal : "+str.equalsIgnoreCase(str1));
		
		
		//substring
		
		System.out.println(str.substring(1, 4));
		
		//trim
		String str2 = "  dsas  dsass  dsa         ";
		System.out.println(str2.trim());
		
		//replace
		String date = "01-01-2019";
		System.out.println(date.replace("-", "/"));
		
		//split
		String str4 = "sachith_hasanga_senevirathna";
		
		String[] str5 = str4.split("_");
		
		for(int i=0;i<str5.length;i++) {
			
			System.out.println(str5[i]);
		}
		
		//string concatination
		
		String aa = "abc";
		String bb = "pqr";
		int cc = 100;
		int dd = 200;
		
		System.out.println(aa+bb+cc+dd);
		System.out.println(cc+dd+aa+bb);
		
		
		
		
		
	}

}
