package q10828;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		SJStack stk = new SJStack(10000);
		Stack<Integer> stk = new Stack<Integer>();

		int cmdNum = sc.nextInt();
		for (int i = 0; i < cmdNum; i++) {
			String cmd = sc.next();

			switch (cmd) {
			case "push":
				int num = sc.nextInt();
				stk.push(num);
				break;
			case "top":
//				stk.top();
				System.out.println(stk.peek());
				break;
			case "size":
				System.out.println(stk.size());
				break;
			case "empty":
				if (stk.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}

				break;
			case "pop":
				if (!stk.isEmpty())
					System.out.println(stk.pop());
				else
					System.out.println(-1);
				break;
			}
		}
		sc.close();
	}
}

class SJStack {
	private int[] n;
	private int top;

	public SJStack(int p) {
		n = new int[p];
		top = -1;
	}

	public void push(int p) {
		n[++top] = p;
	}

	public void top() {
		if (top == -1) {
			System.out.println(top);
		} else {
			System.out.println(n[top]);
		}
	}

	public void size() {
		System.out.println(top + 1);
	}

	public void empty() {
		if (top == -1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	public void pop() {
		if (top != -1) {
			System.out.println(n[top--]);
		} else {
			System.out.println(top);
		}
	}
}
