package q1157;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		sc.close();

//		System.out.println(inp);

		int[] cnt = new int[26];
		inp = inp.toUpperCase();
		for (int i = 0; i < inp.length(); i++) {
			cnt[inp.charAt(i) - 'A']++;
		}
/*
		for (int i = 0; i < cnt.length; i++) {
			System.out.printf("%c : %d\n", (char) ('A' + i), cnt[i]);
		}
*/
		int max = -1;
		int maxCh = -1;
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] > max) {
				max = cnt[i];
				maxCh = i;
			}
		}
//		System.out.println(max);

		int maxcnt = 0;
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] == max) {
				maxcnt++;
			}
		}

		if (maxcnt > 1) {
			System.out.println("?");
		} else {
			System.out.printf("%c\n", (char) ('A' + maxCh));
		}
	}
}
