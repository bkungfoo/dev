import java.util.Date;
import java.util.HashMap;


public class Problem14 {

	private static HashMap <Long, Integer> collatzMap = new HashMap <Long, Integer> ();
	
	private static Long collatz(Long n) {
		if (n % 2 == 0)
			return n / 2;
		else
			return 3 * n + 1;
	}
	
	private static Integer generateCollatzSequence(Long n) {
		if (n == 1) {
			collatzMap.put(1L, 1);
			return 1;
		}
		if (collatzMap.containsKey(n)) {
			return collatzMap.get(n);
		} else {
			Integer k = generateCollatzSequence(collatz(n));
			collatzMap.put(n, k + 1);
			return k + 1;
		}
	}
	
		
	public static void main (String [] args) {
		
		long lDateTime = new Date().getTime();
	    System.out.println("Date() - Time in milliseconds: " + lDateTime);
	    
		int maxLength = 0;
		long maxNumber = 0;
		for (long i = 1; i <= 1000000; i++) {
			Integer l = generateCollatzSequence(i);
			if (l >= maxLength) {
				maxLength = l;
				maxNumber = i;
			}
		}
		System.out.println(maxNumber);
		lDateTime = new Date().getTime();
	    System.out.println("Date() - Time in milliseconds: " + lDateTime);
	    System.out.println("Total number of keys in the map: " + collatzMap.size());
	}
		
}
