package q2164;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

//		System.out.println(N);

		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}

		while (true) {
//			System.out.println(list);

			if (list.size() > 1) {
				list.remove(0);
			} else {
				break;
			}
			if (list.size() > 1) {
				int first = list.getFirst();
				list.add(first);
				list.remove(0);
			} else {
				break;
			}
		}
		System.out.println(list.get(0));
	}
}
