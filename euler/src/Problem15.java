
public class Problem15 {
	/**
	 * Stupid closed form solution that prevents overflow.
	 * 
	 * @param args
	 */
	public static void main (String [] args ) {
		long n = 40 / 20 * 39 * 38 / 19 * 37 * 36 / 18 * 35 * 34 / 17 * 33 * 32 / 16 * 31;
		System.out.println(n);
		n = n * 30 / 15 * 29 * 28 / 14 * 27 * 26 / 13 * 25 * 24 / 12 * 23 * 22 / 11 * 21;
		System.out.println(n);
		n = n / 10 / 9 / 8 / 7 / 6 / 5 / 4 / 3 / 2;
		System.out.println(n);
	}
}
