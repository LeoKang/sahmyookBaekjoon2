package q11728;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String cmd = br.readLine();
		StringTokenizer st = new StringTokenizer(cmd);
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

//		System.out.println(N + " " + M);

		String inp = br.readLine();
		StringTokenizer st2 = new StringTokenizer(inp);
		int[] ar1 = new int[N];
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = Integer.parseInt(st2.nextToken());
		}
		String inp2 = br.readLine();
		StringTokenizer st3 = new StringTokenizer(inp2);
		int[] ar2 = new int[M];
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = Integer.parseInt(st3.nextToken());
		}

		int p1 = 0, p2 = 0;
		do {
			if (p1 == -1) {
//				System.out.print(ar2[p2++] + " ");
				bw.write(ar2[p2++] + " ");
			} else if (p2 == -1) {
//				System.out.print(ar1[p1++] + " ");
				bw.write(ar1[p1++] + " ");
			} else if (ar1[p1] < ar2[p2]) {
				if (p1 < N) {
//					System.out.print(ar1[p1++] + " ");
					bw.write(ar1[p1++] + " ");
				}
			} else {
				if (p2 < M) {
//					System.out.print(ar2[p2++] + " ");
					bw.write(ar2[p2++] + " ");
				}
			}

			if (p1 == N)
				p1 = -1;
			if (p2 == M)
				p2 = -1;
		} while (!(p1 == -1 && p2 == -1));
		bw.flush();
		br.close();
		bw.close();
	}
}
