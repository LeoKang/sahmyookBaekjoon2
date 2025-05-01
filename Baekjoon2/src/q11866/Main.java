package q11866;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(i + 1);
		}

		int cur = K - 1;
		System.out.print("<");
		while (true) {
			System.out.print(list.get(cur));
			list.remove(cur);
			if (list.isEmpty()) {
				System.out.println(">");
				break;
			} else {
				System.out.print(", ");
			}
			cur += K - 1;
			while (cur > list.size() - 1) {
				cur -= list.size();
			}
		}
	}
}
