
public class Problem3 {

	public static void main (String [] args) {
		long number = 600851475143L;
		
		System.out.println(LargestPrimeFactorOf(number));
	}
	
	/**
	 * Uses the sieve method to compute the largest prime less than x.
	 * Takes space linear in x and time = x / densityOfPrimes(x)
	 * 
	 * @param x
	 * @return
	 */
	public static long LargestPrimeFactorOf(long x) {
		if (x <= 0) {
			return -1;
		}
		int arrayLength = (int) Math.sqrt(x); 
		boolean [] sieveArray = new boolean [arrayLength]; // is composite? True = not prime.
		sieveArray[0] = true;
		sieveArray[1] = true;
		int p = 2;
		long xDividedByPrimes = x;
		long maxPrimeFactor = x;
		while (true) {
			
			/*Check if p is a factor of x. Since java takes the floor of a long / int operation, the following condition will only be satisfied if p divides x.
			 * Continue dividing the value of x by p until p no longer divides the value. Set the new x to be x / p ^ r, where r is the number of times p appears as a factor in x. 
			 */
			while (xDividedByPrimes / p * p == xDividedByPrimes) {
				maxPrimeFactor = p;
				xDividedByPrimes = xDividedByPrimes / p;
				arrayLength = (int) Math.sqrt(xDividedByPrimes); //sqrt(x)
			}
			
			//Perform the sieve on p over sqrt(x).
			for (int i = 2 * p; i < arrayLength; i += p) {
				sieveArray[i] = true;
			}
			
			boolean primeFound = false;
			for (int i = p + 1; i < arrayLength; i++) {
				if (!sieveArray[i]) {
					p = i;
					primeFound = true;
					break;
				}
			}
			if (!primeFound) {
				break;
			}
		}
			
		return Math.max(maxPrimeFactor, xDividedByPrimes);
	}
}
