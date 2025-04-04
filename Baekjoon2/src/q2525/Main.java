package q2525;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();

		int min = B + C;
//		System.out.println(A + " " + min);

		if (min > 59) {
			int h = min / 60;
			min = min % 60;
			A += h;
		}
//		System.out.println(A + " " + min);

		if (A >= 24) {
			A %= 24;
		}
		System.out.println(A + " " + min);
	}
}
