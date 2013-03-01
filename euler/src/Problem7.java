
public class Problem7 {
	
	public static int NthPrime(int n) {
		if (n <= 0) {
			return 1;
		}
		
		int upperBound = (int) (2 * n * Math.log(n));
		boolean [] sieveArray = new boolean [upperBound]; // is composite? True = not prime.
		sieveArray[0] = true;
		sieveArray[1] = true;
		int p = 2;
		int count = 1;
		while (count < n) {
			
			//Perform the sieve on p over sqrt(x).
			for (int i = 2 * p; i < upperBound; i += p) {
				sieveArray[i] = true;
			}
			
			boolean primeFound = false;
			for (int i = p + 1; i < upperBound; i++) {
				if (!sieveArray[i]) {
					p = i;
					primeFound = true;
					count++;
					break;
				}
			}
			if (!primeFound) {
				return -1;
			}
		}
		return p;
	}
	
	public static void main (String [] args) {
		System.out.println(NthPrime(10001));
	}
}
