package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesStringColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PayPal India";
		s = s.toLowerCase();
		s = s.replaceAll(" ", "");
		System.out.println(s);
		char[] c = s.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		System.out.println("The duplicates are:");
		for (char n : c) {
			if (charSet.add(n) == false) {
				if (dupCharSet.add(n) == true)
					System.out.print(n);
			}
		}
	}
}

