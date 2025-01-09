package q10039;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		sc.close();

//		for (int i = 0; i < score.length; i++) {
//			System.out.print(score[i] + " ");
//		}

		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] < 40) {
				sum += 40;
			} else {
				sum += score[i];
			}
		}
		System.out.println(sum / score.length);
	}
}
