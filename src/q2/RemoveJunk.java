package q2;

public class RemoveJunk {

	public static void main(String[] args) {

		/*Remove junk characters in the string
		 * keep only characters from a-z and A-Z and 0-9
		 * use Regular expressions 
		 * characters not including a-z and A-Z and 0-9 - [^a-zA-Z0-9]
		 * 
		 */
		
		String s = "Sac%!~hith@^!&@(Has*% anga*^^S47834enevira*(^%thna";
		
		String b = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(b);

	}

}
