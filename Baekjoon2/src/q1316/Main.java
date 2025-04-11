package q1316;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Character> set = new HashSet<Character>();
		int N = sc.nextInt();
		int rescnt = 0;
		for (int i = 0; i < N; i++) {
			boolean res = true;
			String inp = sc.next();
//			System.out.println(inp);

			char before = '\0';
			set.clear();
			for (int j = 0; j < inp.length(); j++) {
				char c = inp.charAt(j);
			
				if (j != 0 && c != before && set.contains(c)) {
					res = false;
					break;
				} else {
					set.add(c);
				}
				before = c;
			}

//			System.out.println(res);
			if(res) rescnt++;
		}
		System.out.println(rescnt);
		sc.close();
	}
}
