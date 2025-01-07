package q2292;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

//		System.out.println(N);

		int n = 0, num = 1;
		do {
			n++;
			if (N <= num)
				break;

			num = num + 6 * n;
//			System.out.println(num);
		} while (true);
		System.out.println(n);
	}
}
