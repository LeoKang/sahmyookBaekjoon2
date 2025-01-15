package q1110;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

//		System.out.println(N);

		int oldNum = 0, newNum = N;
		int cnt = 0;
		do {
			cnt++;
			int n2 = 0, n1 = 0;
			oldNum = newNum;
			n2 = oldNum / 10;
			n1 = oldNum % 10;
			newNum = (n1 * 10) + (n2 + n1) % 10;
		} while (N != newNum);
		System.out.println(cnt);
	}
}
