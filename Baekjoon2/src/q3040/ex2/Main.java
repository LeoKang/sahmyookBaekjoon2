package q3040.ex2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[9];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

		boolean b = false;

//		for (int i = 0; i < inp.length; i++) {
//			System.out.print(inp[i] + " ");
//		}

		for (int i = 0; i < inp.length; i++) {
			for (int j = 0; j < inp.length; j++) {
				if (i != j) {
					// System.out.println(i + " " + j);

					int sum = 0;
					int b1 = inp[i];
					int b2 = inp[j];

					inp[i] = inp[j] = 0;
					for (int k = 0; k < inp.length; k++) {
						sum += inp[k];
					}
					if (sum == 100) {
//						System.out.println("------");
						if (b == false) {
							for (int l = 0; l < inp.length; l++) {
								if (inp[l] != 0)
									System.out.print(inp[l] + " ");
							}
							b = true;
						}
					} else {
						inp[i] = b1;
						inp[j] = b2;
					}
				}
			}
		}
	}
}
