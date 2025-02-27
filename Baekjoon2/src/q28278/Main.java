package q28278;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SStack stk = new SStack();
		String s = br.readLine();
		int N = Integer.parseInt(s);
		for (int i = 0; i < N; i++) {
			String s2 = br.readLine();
			StringTokenizer st = new StringTokenizer(s2);

			int cmd = 0;
			int param = 0;
			cmd = Integer.parseInt(st.nextToken());
			if (st.countTokens() == 2) {
				param = Integer.parseInt(st.nextToken());
			}

			switch (cmd) {
			case 1:
				stk.push(param);
				break;
			case 2:
				if (stk.isEmpty() != 1) {
					System.out.println(stk.pop());
				} else {
					System.out.println(-1);
				}
				break;
			case 3:
				System.out.println(stk.getTop() + 1);
				break;
			case 4:
				System.out.println(stk.isEmpty());
				break;
			case 5:
				if (stk.isEmpty() != 1) {
					System.out.println(stk.getTopValue());
				} else {
					System.out.println(-1);
				}
				break;
			}
		}
	}
}

class SStack {
	private int[] ar;
	private int top;

	public SStack() {
		ar = new int[1000001];
		top = -1;
	}

	public void push(int v) {
		ar[++top] = v;
	}

	public int pop() {
		return ar[top--];
	}

	public int isEmpty() {
		if (top == -1) {
			return 1;
		} else {
			return 0;
		}
	}

	public int getTop() {
		return top;
	}

	public int getTopValue() {
		return ar[top];
	}
}