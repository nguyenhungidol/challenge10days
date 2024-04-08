package HungNguyen;

import java.util.Scanner;

public class Helloworld {
	public static void main(String[] args) {
		String name, age;
		Scanner sc = new Scanner(System.in);
		int a = 5, b = 10;
		int c = Math.max(a, b);
		System.out.println("Max:" + c);
		System.out.println("Sqrt(a):" + Math.sqrt(a));
		float d = (float) Math.ceil(Math.sqrt(a));
		System.out.println(d);
	}
}
