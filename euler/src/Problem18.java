import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Problem18 {

	public static void main (String [] args ) {
		File f = new File("p18.txt");
		Scanner input;
		try {
			input = new Scanner(f);
			if (input.hasNext()) {
				int [] last_row = new int [3];
				int [] current_row = new int [1];
				last_row[1] = Integer.parseInt(input.next()); // Initialize array
				
				int numCol = 2;
				while(input.hasNext()) {
					current_row = new int [numCol + 2];
					for (int i = 1; i <= numCol; i++) {
						current_row[i] = Integer.parseInt(input.next()) + Math.max(last_row[i-1], last_row[i]);
					}
					numCol++;
					last_row = current_row;
				}
				int maxValue = 0;
				for (int i = 0; i < current_row.length; i++) {
					if (current_row[i] > maxValue) {
						maxValue = current_row[i];
					}
				}
				System.out.println(maxValue);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
