package q1193;

import java.util.Scanner;

public class Main {
	private static int leftValue = 1, rightValue = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();

		// RIGHT - LEFTDOWN - DOWN - RIGHTUP - RIGHTUP - RIGHT - LEFTDOWN - LEFTDOWN -
		// LEFTDOWN - DOWN
		// 1/1 - 1/2 - 2/1 - 3/1 - 2/2 - 1/3 - 1/4 - 2/3 - 3/2 - 4/1 - 5/1
		// RIGHT(1) - LEFTDOWN(1, 3, 5 ...) - DOWN(1) - RIGHTUP(2, 4, 6 ...) - RIGHT

		int ldcnt = 1;
		int rucnt = 2;
		while (true) {
			if (--X == 0)
				break;
			rightValue++; // right

			for (int i = 0; i < ldcnt; i++) {
				if (--X == 0)
					break;
				// leftdown
				leftValue++;
				rightValue--;
			}
			if (X == 0)
				break;
			ldcnt += 2;

			if (--X == 0)
				break;
			leftValue++; // down

			for (int j = 0; j < rucnt; j++) {
				if (--X == 0)
					break;
				// rightup
				leftValue--;
				rightValue++;
			}
			if (X == 0)
				break;
			rucnt += 2;
		}
		System.out.println(leftValue + "/" + rightValue);
	}
}
