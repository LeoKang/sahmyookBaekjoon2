package q1913;

import java.util.Scanner;

public class Main {
	static int[][] ar;

	public static void print() {
		// print
//		System.out.println("-----------------");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
				// System.out.printf("%2d ", ar[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int p = sc.nextInt();
		sc.close();

//		System.out.println(N + " " + p);
		ar = new int[N][N];

		int cx = N / 2, cy = N / 2;
//		System.out.println(cx + " " + cy);
		int num = 1;
		ar[cy][cx] = num++;
		int d = 1;

		// UP - RIGHT - DOWN - LEFT
		do {
//			print();
			// UP
			for (int i = 1; i <= d; i++) {
				if (cx == 0 && cy == 0)
					break;
				cy = cy - 1;
				ar[cy][cx] = num++;
			}
//			print();

			if (cx == 0 && cy == 0) {
				print();
				break;
			}
				
			// RIGHT
			for (int i = 1; i <= d; i++) {
				cx = cx + 1;
				ar[cy][cx] = num++;
			}
//			print();

			// DOWN
			for (int i = 0; i <= d; i++) {
				cy = cy + 1;
				ar[cy][cx] = num++;
			}

			// LEFT
			for (int i = 0; i <= d; i++) {
				cx = cx - 1;
				ar[cy][cx] = num++;
			}

			d = d + 2;
		} while (true);

		// sequence search
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] == p) {
					System.out.println((i + 1) + " " + (j + 1));
				}
			}
		}
	}
}
