package q16953;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long from = sc.nextLong();
		long to = sc.nextLong();
		sc.close();

//		System.out.println(from + " " + to);
		int cnt = 0;
		while (from < to) {
			if (to % 10 == 1) {
				to /= 10;
			} else if (to % 2 == 0) {
				to /= 2;
			} else {
				break;
			}
			cnt++;
//			System.out.print(to + " ");
		}
		if (from == to)
			System.out.println(cnt + 1);
		else
			System.out.println(-1);
	}
}
