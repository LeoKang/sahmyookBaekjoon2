package q18185;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 라면 3개 : 7원
 * 라면 2개 : 5원
 * 라면 1개 : 3원
 */

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String inp = bf.readLine();
		int N = Integer.parseInt(inp);
		int[] A = new int[N];

		String inp2 = bf.readLine();
		StringTokenizer st = new StringTokenizer(inp2);
		int k = 0;
		while (st.hasMoreTokens()) {
			A[k++] = Integer.parseInt(st.nextToken());
		}

		int price = 0;
		do {
			int max = 0;
			int idx = -1;
			for (int i = 0; i < A.length; i++) {
				if (max < A[i]) {
					max = A[i];
					idx = i;
				}
			}
			if (max == 0)
				break;

			// 라면 3개 구입 check
			if ((idx + 2 < A.length) && A[idx] != 0 && A[idx + 1] != 0 && A[idx + 2] != 0) {
				int min = Math.min(Math.min(A[idx], A[idx + 1]), Math.min(A[idx + 1], A[idx + 2]));

				price += (7 * min);
				A[idx] -= min;
				A[idx + 1] -= min;
				A[idx + 2] -= min;

//				price += 7;
//				A[idx]--;
//				A[idx + 1]--;
//				A[idx + 2]--;
			}
			// 라면 2개 구입 check
			else if ((idx + 1 < A.length) && A[idx] != 0 && A[idx + 1] != 0) {
				int min = Math.min(A[idx], A[idx + 1]);

				price += (5 * min);
				A[idx] -= min;
				A[idx + 1] -= min;
			}
			// 라면 1개 구입 check
			else if (A[idx] != 0) {
				price += 3;
				A[idx]--;
			}
		} while (true);
		System.out.println(price);
	}
}
