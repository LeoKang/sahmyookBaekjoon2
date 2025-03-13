package q5086;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = 0, inp2 = 0;
		do {
			inp1 = sc.nextInt();
			inp2 = sc.nextInt();

			if (inp1 == 0 && inp2 == 0)
				break;

			if (inp1 < inp2) { // factor
				do {
					inp2 %= inp1;
				} while (inp1 < inp2);

				if (inp2 == 0) {
					System.out.println("factor");
				} else {
					System.out.println("neither");
				}
			} else if (inp1 > inp2) { // multiple
				do {
					inp1 %= inp2;
				} while (inp1 > inp2);

				if (inp1 == 0) {
					System.out.println("multiple");
				} else {
					System.out.println("neither");
				}
			} else {
				System.out.println("else");
			}
		} while (true);
		sc.close();
	}
}
