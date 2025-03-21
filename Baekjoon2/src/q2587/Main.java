package q2587;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[5];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

		int sum = 0;
		for (int i = 0; i < inp.length; i++) {
			sum += inp[i];
		}
		System.out.println(sum / inp.length);

		Arrays.sort(inp);
		System.out.println(inp[inp.length / 2]);
	}
}
