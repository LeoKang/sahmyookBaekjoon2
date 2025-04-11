package q10773;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int K = sc.nextInt();
		for (int i = 0; i < K; i++) {
			int n = sc.nextInt();
			if (n == 0) {
//				ar.removeLast();
				ar.remove(ar.size() - 1);
			} else {
				ar.add(n);
			}
		}
		sc.close();

		Iterator<Integer> it = ar.iterator();
		int sum = 0;
		while (it.hasNext()) {
			sum += it.next();
		}
		System.out.println(sum);
	}
}
