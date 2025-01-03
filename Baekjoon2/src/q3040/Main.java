package q3040;

import java.util.Scanner;

public class Main {
	static int[] inp;

	public static void rec(int p1, int p2) {
		int t1 = inp[p1];
		int t2 = inp[p2];

		inp[p1] = 0;
		inp[p2] = 0;

		// sum
		int sum = 0;
		for (int i = 0; i < inp.length; i++) {
			sum += inp[i];
		}
		if (sum == 100) {
			for (int i = 0; i < inp.length; i++) {
				if (inp[i] != 0)
					System.out.println(inp[i]);
			}
			return;
		} else {
			inp[p1] = t1;
			inp[p2] = t2;

			if (p2 + 1 < inp.length)
				p2++;
			else {
				p1++;
				p2 = 0;
			}

			rec(p1, p2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		inp = new int[9];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

		rec(0, 1);
	}
}
