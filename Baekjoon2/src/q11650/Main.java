package q11650;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println(x + " " + y);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Point[] parr = new Point[N];
		List<Point> plist = new ArrayList<Point>();
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			parr[i] = new Point(x, y);

			plist.add(parr[i]);
		}
		sc.close();

//		for (int i = 0; i < parr.length; i++) {
//			parr[i].print();
//		}

		Collections.sort(plist, new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				int o1x = o1.getX();
				int o2x = o2.getX();
				if (o1x != o2x) {
					return o1x - o2x;
				} else {
					return o1.getY() - o2.getY();
				}
			}
		});

		for (int i = 0; i < plist.size(); i++) {
			Point p = plist.get(i);
			p.print();
		}
	}
}
