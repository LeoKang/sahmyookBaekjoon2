package q2346;

import java.util.Scanner;

public class Main {
	static int N;
	static int[] b, blow;
	static int p;

	public static int move_rev(int cur) {
		System.out.println("cur : " + cur);
		System.out.println("b[] : " + b[cur - 1]);

		int cnt = 0;
		int max = Math.abs(b[cur - 1]);
		int i = p - 1;
		while (cnt < max) {
			if (blow[i--] == 0) {
				cnt++;
			}
			if (i < 0)
				i = b.length - 1;

		}

		return i + 2;
	}

	public static void show_b() {
		for (int i = 0; i < b.length; i++) {
			System.out.printf("%2d ", b[i]);
		}
		System.out.println();
	}

	public static void show_blow() {
		for (int i = 0; i < blow.length; i++) {
			System.out.printf("%2d ", blow[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		b = new int[N];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		sc.close();
		blow = new int[N];

		p = 1;
		do {
			show_b();
			show_blow();
			System.out.println("p[" + p + "] "); // 현재 위치

			blow[p - 1] = b[p - 1];
			System.out.print((p + 1) + " ");

			int c = blow[p - 1];
			if (c > 0) {
				int j = p;
				while (j <= c) {
					if (j == N - 1)
						j = 0;
					if (blow[j] == 0)
						p++;
					j++;
				}
			} else {
				p = move_rev(p);
			}

			System.out.println("----------------------");
			show_b();
			show_blow();

		} while (true);
	}
}
