package q1920;

import java.util.ArrayList;
import java.util.HashSet;
//import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			set.add(num);
		}
		int M = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < M; i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		sc.close();

		// print
//		Iterator<Integer> it = set.iterator();
//		while (it.hasNext()) {
//			System.out.print(it.next() + " ");
//		}
//		System.out.println();
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i) + " ");
//		}

		for (int i = 0; i < M; i++) {
			int num = list.get(i);
			if (set.contains(num)) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}
}
