package q9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stk = new Stack<Character>();
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			boolean res = true;
			stk.clear();
			String inp = sc.next();

			for (int j = 0; j < inp.length(); j++) {
				if (inp.charAt(j) == '(') {
//					System.out.println(inp.charAt(j));
					stk.push('(');
				} else { // ')'
					if (stk.size() > 0) {
						stk.pop();
					} else {
						res = false;
						break;
					}
				}
			}
			if (stk.isEmpty() && res) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
