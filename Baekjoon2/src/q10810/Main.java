package q10810;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int ar[] = new int[N];
		for (int idx = 0; idx < M; idx++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();

			for (int c = i - 1; c < j; c++) {
				ar[c] = k;
			}
		}
		sc.close();

		for (int idx = 0; idx < ar.length; idx++) {
			System.out.print(ar[idx] + " ");
		}
	}
}
