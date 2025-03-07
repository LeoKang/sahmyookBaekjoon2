package q2745;

import java.util.Scanner;

/*
 * 9A 11
 * -> 109
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int pns = sc.nextInt();
		sc.close();
		/*
		 * System.out.println(str);
		 * System.out.println(pns);
		 * System.out.println("----------");
		 */
		int len = str.length();
		int res = 0;
		for (int i = 0; i < len; i++) {
//			System.out.println(str.charAt(i));
			char c = str.charAt(i);
			if (i == len - 1) {
				if ('0' <= c && c <= '9') {
					res += (c - '0');
				} else {
					res += (c - 'A' + 10);
				}
			} else {
				if ('0' <= c && c <= '9') {
					res += (c - '0') * Math.pow(pns, len - i - 1);
				} else {
					res += (c - 'A' + 10) * Math.pow(pns, len - i - 1);
				}
			}
//			System.out.println("res = " + res);
		}
		System.out.println(res);
	}
}
