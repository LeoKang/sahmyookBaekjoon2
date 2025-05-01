package q10815;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int card[] = new int[N];

		String inp = br.readLine();
		StringTokenizer st = new StringTokenizer(inp);
		int i = 0;
		while (st.hasMoreTokens()) {
			card[i++] = Integer.parseInt(st.nextToken());
		}

		int M = Integer.parseInt(br.readLine());
		int hon[] = new int[M];
		inp = br.readLine();
		st = new StringTokenizer(inp);
		i = 0;
		while (st.hasMoreTokens()) {
			hon[i++] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(card);

		for (int j = 0; j < hon.length; j++) {
			int ret = Arrays.binarySearch(card, hon[j]);
			if (ret >= 0) {
				System.out.print(1);
			} else {
				System.out.print(0);
			}
			System.out.print(" ");
		}
	}
}
