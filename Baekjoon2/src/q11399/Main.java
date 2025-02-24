package q11399;

import java.util.Scanner;

public class Main {
	private static int N;
	private static int[] h, p;
	private static int min;

	public static void comb(int param) {
		if (param == N) {
			// 중복 제거
			for (int i = 0; i < h.length; i++) {
				for (int j = 1; j < h.length; j++) {
					if (i != j && h[i] == h[j])
						return;
				}
			}

			// print
			for (int i = 0; i < h.length; i++) {
				System.out.print(h[i] + " ");
			}
			System.out.println();

			// time sum

			int sum = 0;
			int cur = 0;
			for (int i = 0; i < h.length; i++) {
				cur = h[p[i]-1];
				sum += (h[i] + cur);
				
			}
			System.out.println("(" + sum + ")");
			if (min > sum)
				min = sum;
			return;
		}

		for (int i = 1; i <= N; i++) {
			h[param] = i;
			comb(param + 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		min = Integer.MAX_VALUE;
		N = sc.nextInt();
		p = new int[N];
		h = new int[N];
		
		for (int i = 0; i < p.length; i++) {
			p[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.print("p : ");
		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i] + " ");
		}
		System.out.println();

		comb(0);
		System.out.println("min : " + min);
	}
}
