package q3052;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

//		for (int i = 0; i < inp.length; i++) {
//			System.out.print(inp[i] + " ");
//		}

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < inp.length; i++) {
			set.add(inp[i] % 42);
		}
/*
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			int element = iterator.next();
			System.out.print(element + " ");
		}
*/
		System.out.println(set.size());
	}
}
