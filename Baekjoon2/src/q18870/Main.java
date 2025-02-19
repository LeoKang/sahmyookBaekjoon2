package q18870;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int[] compress(int[] inp) {
		
		
		
		return null;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int num[] = new int[N];
		int inp[] = new int[N];
		int comp[] = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());

		int i = 0;
		while (st.countTokens() != 0) {
			inp[i++] = Integer.parseInt(st.nextToken());
		}

		System.out.print("inp : ");
		for (int j = 0; j < inp.length; j++) {
			System.out.print(inp[j] + " ");
		}
		System.out.println();

		num = Arrays.copyOf(inp, inp.length);
		Arrays.sort(num);

		System.out.print("num : ");
		for (int j = 0; j < num.length; j++) {
			System.out.print(num[j] + " ");
		}
		System.out.println();

		comp[0] = 0;
		for (int j = 1; j < num.length; j++) {
			if (num[j - 1] != num[j]) {
				comp[j] = comp[j - 1] + 1;
			} else {
				comp[j] = comp[j - 1];
			}
		}

		System.out.print("comp : ");
		for (int j = 0; j < comp.length; j++) {
			System.out.print(comp[j] + " ");
		}
		System.out.println();

		for (int j = 0; j < inp.length; j++) {
			int idx = Arrays.binarySearch(num, inp[j]);
//			System.out.print(comp[idx] + " ");
			bw.write(comp[idx] + " ");
		}
		bw.flush();
		bw.close();
	}
}
