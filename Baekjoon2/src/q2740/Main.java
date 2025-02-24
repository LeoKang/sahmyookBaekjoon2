package q2740;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] A = new int[N][M];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}

		int M2 = sc.nextInt();
		int K = sc.nextInt();
		int[][] B = new int[M2][K];
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				B[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		sc.close();

		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}

		int[][] res = new int[N][K];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				for (int k = 0; k < K; k++) {
					res[i][k] += (A[i][j] * B[j][k]);
				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K; j++) {
				System.out.printf(res[i][j] + " ");
			}
			System.out.println();
		}
	}
}
