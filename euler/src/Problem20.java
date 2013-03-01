
public class Problem20 {
	public static void main (String [] args) {
		int [] digits = new int [300];
		digits[0] = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < digits.length; k++) {
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
