import java.util.ArrayList;


public class Problem4 {

	public static boolean IsPalindrome (String s) {
		for (int i = 0; i <= s.length() / 2; i++) {
			if (s.substring(i, i+1).compareTo(s.substring(s.length()-i-1,s.length()-i)) != 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main (String [] args) {
		int [] arrayOfFactors1 = new int [20];
		int [] arrayOfFactors2 = new int [20];
		int x = 1000;
		for (int i = 0; i < 10; i++) {
			arrayOfFactors1[2 * i] = x - 1;
			arrayOfFactors1[2 * i + 1] = x - 9;
			arrayOfFactors2[2 * i] = x - 3;
			arrayOfFactors2[2 * i + 1] = x - 7;
			x -= 10;
		}

				
		ArrayList<String> palindromes = new ArrayList<String> ();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				String s = new Integer(arrayOfFactors1[2 * i] * arrayOfFactors1[2 * j + 1]).toString();
				System.out.println(arrayOfFactors1[2 * i] + " * " + arrayOfFactors1[2 * j + 1] + " = " + s);
				if (IsPalindrome(s)) {
					palindromes.add(s);
					System.out.println(s + "is a palindrome.");

				}
			}
		}

		for (int i = 0; i < 20; i++) {
			for (int j = i; j < 20; j += 2) {
				String s = new Integer(arrayOfFactors2[i] * arrayOfFactors2[j]).toString();
				System.out.println(arrayOfFactors2[i] + " * " + arrayOfFactors2[j] + " = " + s);
				if (IsPalindrome(s)) {
					palindromes.add(s);
					System.out.println(s + "is a palindrome.");
				}
			}
		}
		
		for (int i = 0; i < palindromes.size(); i++) {
		}
	}
}
