package q1254;

import java.util.Scanner;

public class Main {
	public static int isPalindrome(String p) {
//		System.out.println("p : " + p);

		for (int i = 0, j = p.length() - 1; i < p.length() / 2; i++, j--) {
			if (p.charAt(i) != p.charAt(j))
				return 0;
		}

		return p.length();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String org = sc.next();
		sc.close();

		int res = 0;
//		System.out.println(org);
		StringBuilder sb = new StringBuilder(org);
		sb.reverse();
//		System.out.println(sb);

		String inp = org;
		if (inp.equals(sb.toString())) {
			res = inp.length();
		} else {
			int i = 0;
			String ad = "";
			do {
				res = isPalindrome(inp);
				ad = org.charAt(i++) + ad;
				inp = org + ad;
			} while (res == 0);
		}
		System.out.println(res);
	}

}
