package q2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inp = br.readLine();
		br.close();

//		Scanner sc = new Scanner(System.in);
//		String inp = sc.next();
//		sc.close();

		// System.out.println(inp);

		int cnt = 0;
		for (int i = 0; i < inp.length(); i++) {
			char c = inp.charAt(i);

			char next = '\0';
			if (i < inp.length() - 1)
				next = inp.charAt(i + 1);

			switch (c) {
			case 'c':
				if (next == '=' || next == '-') {
					cnt--;
				}
				break;
			case 'd':
				if (next == '-') {
					cnt--;
				} else if (next == 'z') {
					if (i < inp.length() - 2 && inp.charAt(i + 2) == '=') {
						cnt--;
					}
				}
				break;
			case 'l':
			case 'n':
				if (next == 'j') {
					cnt--;
				}
				break;
			case 's':
			case 'z':
				if (next == '=') {
					cnt--;
				}
				break;
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}
