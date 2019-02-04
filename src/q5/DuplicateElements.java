package q5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		String a[] = { "java", "javascript", "python", "c", "java","html","python","java" };

		System.out.println("*********1st Method********");
		
		/*
		 * 1. compare each element : O(nxn) --- worst solution
		 */
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i].equals(a[j])) {

					System.out.println(a[i]);
				}
			}
		}

		System.out.println("*********2nd Method********");

		/*
		 * 2. Using HashSet - Java Collections HashSet stores only unique values. if it
		 * finds a value is already in the hashset, add() method will return false time
		 * complexity - O(n)
		 */
		Set<String> a1 = new HashSet<String>();
		for (String a2 : a) {
			if (a1.add(a2) == false) {
				System.out.println("Duplicate value is : " + a2);
			}
		}
		
		System.out.println("*********3rd Method********");
		
		/*
		 * 3. Using HashMap - Java Collections
		 * HashMap stores values in key-value combination
		 * after storing the values to the HashMap, if the value for a particular key is greater than 1
		 * it means that key has duplicates
		 * complexity - O(2n)
		 * 
		 */
		
		Map<String,Integer> s1 = new HashMap<String,Integer>();
		
		for(String s2 : a) {
			Integer count = s1.get(s2);
			if(count == null) {
				s1.put(s2, 1);
			}
			else {
				s1.put(s2, ++count);
			}
		
		}
		
		//get the values from HashMap
		
		 Set<Entry<String,Integer>> entrySet= s1.entrySet();
		 for(Entry<String,Integer> entry: entrySet) {
			 if(entry.getValue()>1) {
				 System.out.println("Duplicate value is : " + entry.getKey());
			 }
		 }

	}

}
