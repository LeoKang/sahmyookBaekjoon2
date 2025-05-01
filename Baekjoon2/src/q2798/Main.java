package q2798;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int card[] = new int[N];
		for (int i = 0; i < N; i++) {
			card[i] = sc.nextInt();
		}
		sc.close();
/*
		System.out.println(N + " " + M);
		for (int i : card) {
			System.out.print(i + " ");
		}
		System.out.println();
*/
		int sum = 0;
		int near = 0;
		for (int i = 0; i < N; i++) {
			sum += card[i];
			for (int j = 0; j < N; j++) {
				if (i == j) {
					continue;
				}
				sum += card[j];
				for (int k = 0; k < N; k++) {
					if (i == k || j == k) {
						continue;
					}
					sum += card[k];

					if (sum <= M && sum > near) {
//						System.out.println(i + " " + j + " " + k);
//						System.out.println(card[i] + " " + card[j] + " " + card[k] + " = " + sum);
						near = sum;
					}
					sum -= card[k];
				}
				sum -= card[j];
			}
			sum -= card[i];
		}
		System.out.println(near);
	}
}
