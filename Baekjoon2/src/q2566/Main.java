package q2566;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = -1;
		int row = -1;
		int col = -1;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				int inp = sc.nextInt();
				if (max < inp) {
					max = inp;
					row = i;
					col = j;
				}
			}
		}
		sc.close();
		System.out.println(max);
		System.out.println((row + 1) + " " + (col + 1));
	}
}
