
public class Problem16 {
	public static void main (String [] args) {
		int [] digits = new int [400];
		digits[0] = 1;
		boolean carry = false;
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < digits.length; j++) {
				if (digits[j] < 5) {
					if (carry) {
						digits[j] = 2 * digits[j] + 1;
					} else {
						digits[j] *= 2;
					}
					carry = false;
				} else {
					if (carry) {
						digits[j] = 2 * digits[j] - 10 + 1;
					} else {
						digits[j] = 2 * digits[j] - 10;
					}
					carry = true;
				}
			}
		}
		
		int sum = 0;
		for (int i = 0; i < digits.length; i++) {
			sum+=digits[i];
		}
		System.out.println(sum);
	}
	
}
