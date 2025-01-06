package q2588;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		sc.close();

//		System.out.println(str1);
//		System.out.println(str2);

		// case 2. -----------------------
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int num23 = num2 % 10;
		int num22 = (num2 % 100) / 10;
		int num21 = num2 / 100;
		
		System.out.println(num1 * num23);
		System.out.println(num1 * num22);
		System.out.println(num1 * num21);
		System.out.println(num1 * num2);
		
		// case 1. -----------------------
//		int num1 = Integer.parseInt(str1);
//		int num2 = Integer.parseInt(str2);
//
//		int num23 = str2.charAt(2) - '0';
////		System.out.println(num23);
//
//		int num22 = str2.charAt(1) - '0';
////		System.out.println(num22);
//
//		int num21 = str2.charAt(0) - '0';
////		System.out.println(num21);
//
//		System.out.println(num1 * num23);
//		System.out.println(num1 * num22);
//		System.out.println(num1 * num21);
//		System.out.println(num1 * num2);
	}
}
