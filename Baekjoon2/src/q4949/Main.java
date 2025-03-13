package q4949;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	static enum status {
		NONE, SUCCESS, FAIL
	};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stk = new Stack<Character>();
		String inp = "";

		while (true) {
			stk.clear();
			status st = status.SUCCESS;
			inp = sc.nextLine();

			if (inp.length() == 1 && inp.charAt(0) == '.')
				break;

			for (int i = 0; i < inp.length(); i++) {
				char c = inp.charAt(i);
				if (c == '(' || c == '[') {
					stk.push(c);
				} else if (c == ')') {
					if (stk.isEmpty() == false && stk.pop() == '(') {
						st = status.SUCCESS;
					} else {
						st = status.FAIL;
						break;
					}
				} else if (c == ']') {
					if (stk.isEmpty() == false && stk.pop() == '[') {
						st = status.SUCCESS;
					} else {
						st = status.FAIL;
						break;
					}
				}
			}
			if (!stk.isEmpty()) {
				st = status.FAIL;
			}
			if (st == status.SUCCESS) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		sc.close();
	}
}
