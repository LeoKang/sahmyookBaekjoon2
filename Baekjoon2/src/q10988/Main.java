package q10988;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		sc.close();

		int palindrome = 1;
		for (int i = 0, j = inp.length() - 1; i < inp.length() / 2; i++, j--) {
			if (inp.charAt(i) == inp.charAt(j)) {
				palindrome = 1;
			} else {
				palindrome = 0;
				break;
			}
		}
		System.out.println(palindrome);
	}
}
