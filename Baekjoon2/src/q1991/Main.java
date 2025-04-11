package q1991;

import java.util.Scanner;

public class Main {
	// center, left, right
	static char[][] inp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		inp = new char[N][3];
		for (int i = 0; i < inp.length; i++) {
			for (int j = 0; j < inp[i].length; j++) {
				inp[i][j] = sc.next().charAt(0);
			}
		}
		sc.close();
/*
		for (int i = 0; i < inp.length; i++) {
			for (int j = 0; j < inp[i].length; j++) {
				System.out.printf(inp[i][j] + " ");
			}
			System.out.println();
		}
*/
		preorder(inp[0][0]);
		System.out.println();
		inorder(inp[0][0]);
		System.out.println();
		postorder(inp[0][0]);
	}

	public static void preorder(char node) {
		for (int i = 0; i < inp.length; i++) {
			if (node == '.')
				return;
			else if (node == inp[i][0]) {
				System.out.print(node);
				preorder(inp[i][1]);
				preorder(inp[i][2]);
			}
		}
	}
	
	public static void inorder(char node) {
		for (int i = 0; i < inp.length; i++) {
			if (node == '.')
				return;
			else if (node == inp[i][0]) {
				inorder(inp[i][1]);
				System.out.print(node);
				inorder(inp[i][2]);
			}
		}
	}
	
	public static void postorder(char node) {
		for (int i = 0; i < inp.length; i++) {
			if (node == '.')
				return;
			else if (node == inp[i][0]) {
				postorder(inp[i][1]);
				postorder(inp[i][2]);
				System.out.print(node);
			}
		}
	}
}
