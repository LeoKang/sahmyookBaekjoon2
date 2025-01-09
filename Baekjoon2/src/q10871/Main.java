package q10871;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int inp[] = new int[N];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

//		System.out.println(N + " " + X);
//		for (int i = 0; i < inp.length; i++) {
//			System.out.print(inp[i] + " ");
//		}

		for (int i = 0; i < inp.length; i++) {
			if (inp[i] < X) {
				System.out.print(inp[i] + " ");
			}
		}
	}
}
