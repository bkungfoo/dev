
public class Problem9 {

	public static long SumOfPrimesUpToValue(int x) {
		if (x <= 1) {
			return 0;
		}
		
		boolean [] sieveArray = new boolean [x]; // is composite? True = not prime.
		sieveArray[0] = true;
		sieveArray[1] = true;
		int p = 2;
		long sump = 2;
		
		while (true) {
			
			//Perform the sieve on p over range x.
			for (int i = 2 * p; i < x; i += p) {
				sieveArray[i] = true;
			}
			
			boolean primeFound = false;
			for (int i = p + 1; i < x; i++) {
				if (!sieveArray[i]) {
					p = i;
					primeFound = true;
					sump += p;
					System.out.println(p + " : " + sump);
					break;
				}
			}
			if (!primeFound) {
				return sump;
			}
		}
		
	}
	
	public static void main (String [] args) {
		System.out.println(SumOfPrimesUpToValue(2000000));
	}

}
