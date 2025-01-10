package q10845;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String cmd = sc.next();
			switch (cmd) {
			case "push":
				int num = sc.nextInt();
				queue.add(num);
				break;
			case "pop":
				if(queue.isEmpty()) {
					System.out.println(-1);
				}else 
					System.out.println(queue.poll());
				break;
			case "size":
				System.out.println(queue.size());
				break;
			case "empty":
				if (queue.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case "front":
				if (queue.isEmpty()) {
					System.out.println(-1);
				} else
					System.out.println(queue.getFirst());
				break;
			case "back":
				if (queue.isEmpty()) {
					System.out.println(-1);
				} else
					System.out.println(queue.getLast());
				break;
			}
		}
		sc.close();
	}
}
