
public class Problem2 {

	public static void main (String [] args) {
		long maxVal = Long.parseLong(args[0]);
		System.out.println(maxVal);
		
		long a = 0;
		long b = 1;
		long c = 1;
		long sumEvens = 0;
		while (c <= maxVal) {
			a = b;
			b = c;
			
			if (c%2 == 0) {
				sumEvens += c;
			}
			
			c = a + b;

		}

		System.out.println(sumEvens);
	}
	
}
