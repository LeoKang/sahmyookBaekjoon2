package q10814;

import java.util.Arrays;
import java.util.Scanner;

class Person implements Comparable<Person> {
	private int seq;
	private int age;
	private String name;

	public Person(int seq, int age, String name) {
		this.seq = seq;
		this.age = age;
		this.name = name;
	}

	public void print() {
		System.out.println(age + " " + name);
	}

	@Override
	public int compareTo(Person o) {
		if (this.age > o.age)
			return 1;
		else if (this.age < o.age)
			return -1;
		else {
			if (this.seq > o.seq) {
				return 1;
			} else {
				return -1;
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Person[] p = new Person[N];
		int seq = 0;
		for (int i = 0; i < p.length; i++) {
			int age = sc.nextInt();
			String name = sc.next();
			p[i] = new Person(seq++, age, name);
		}
		sc.close();

//		for (int i = 0; i < p.length; i++) {
//			p[i].print();
//		}

		Arrays.sort(p);

		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}
	}

}
