import java.util.Date;
import java.util.HashMap;
import utils.Factorization;


public class Problem12 {

	public static void main (String [] args) {
		
		long lDateTime = new Date().getTime();
	    System.out.println("Date() - Time in milliseconds: " + lDateTime);
		long last = 10;
		int lastNumFactors = Factorization.getNumFactors(last);
		while (true) {
			long current = last + 1;
			int currentNumFactors = 0;
			if (current % 2 == 0) {
				currentNumFactors = Factorization.getNumFactors(current / 2);
			} else {
				currentNumFactors = Factorization.getNumFactors(current);
			}
			
			if (currentNumFactors * lastNumFactors > 500) {
				break;
			}
			lastNumFactors = currentNumFactors;
			last++;
		}
		System.out.println(last * (last + 1) / 2);
		//System.out.println(Factorization.getNumFactors(last) + " * " + Factorization.getNumFactors((last + 1) / 2));
		//System.out.println(Factorization.getFactors(last));
		//System.out.println(Factorization.getFactors((last + 1) / 2));
		
		lDateTime = new Date().getTime();
	    System.out.println("Date() - Time in milliseconds: " + lDateTime);
		
		// Slow execution for comparison
		
		long n = 55;
		long d = 10;
		while (true) {
			if (Factorization.getNumFactors(n) >= 500) {
				break;
			}
			d++;
			n += d;
		}
		System.out.println("slow version");
		System.out.println(n);
		
		lDateTime = new Date().getTime();
	    System.out.println("Date() - Time in milliseconds: " + lDateTime);
		
	}
	

}
