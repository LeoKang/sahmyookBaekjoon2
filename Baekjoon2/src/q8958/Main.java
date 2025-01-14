package q8958;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int sum = 0, weight = 0;
			String score = sc.next();

			for (int j = 0; j < score.length(); j++) {
				if (score.charAt(j) == 'O') {
					sum += ++weight;
				} else {
					weight = 0;
				}
			}

//			System.out.println(score);
			System.out.println(sum);
		}
		sc.close();
	}
}
