package q2439;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

//	System.out.println(N);

		for (int i = 0; i < N; i++) {
			// '?' 출력
			for (int k = 0; k < N - i - 1; k++) {
				System.out.print(" ");
			}

			// '*' 출력
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
