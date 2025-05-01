package q12789;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stk = new Stack<>();
		int N = sc.nextInt();
		boolean b = true;

		int lastValue = 0;
		for (int i = 0; i < N; i++) {
			int inp = sc.nextInt();

			if (stk.isEmpty())
				stk.push(inp);
			else {
				if (inp < lastValue) {
					b = false;
					break;
				}
				if (inp < stk.peek()) {
					stk.push(inp);
				} else {
					do {
						if (!stk.isEmpty()) {
							lastValue = stk.pop();
						} else {
							b = false;
							break;
						}
						if (stk.isEmpty())
							break;
					} while (inp > stk.peek());
					stk.push(inp);
				}
			}
		}
		sc.close();

		if (b)
			System.out.println("Nice");
		else
			System.out.println("Sad");
	}
}
