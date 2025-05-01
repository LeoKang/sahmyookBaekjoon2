package q2493;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int inp[] = new int[N];
//		int res[] = new int[N];
		
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		for (int i = 0; i < inp.length; i++) {
			inp[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = inp.length - 1; i >= 0; i--) {
			int c = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (inp[i] < inp[j]) {
					c = j + 1;
					break;
				}
			}
//			res[i] = c;
			inp[i] = c;
		}

		for (int i = 0; i < inp.length; i++) {
			System.out.print(inp[i] + " ");
		}
	}
}
