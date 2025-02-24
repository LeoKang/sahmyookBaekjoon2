package q2738;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] mat1 = new int[N][M];
		int[][] mat2 = new int[N][M];
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2[i].length; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}
		sc.close();
/*
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				System.out.print(mat1[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2[i].length; j++) {
				System.out.print(mat2[i][j] + " ");
			}
			System.out.println();
		}
*/
		int[][] res = new int[N][M];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				res[i][j] = mat1[i][j] + mat2[i][j];
			}
		}

		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
//				System.out.print(res[i][j] + " ");
				System.out.print(mat1[i][j] + mat2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
