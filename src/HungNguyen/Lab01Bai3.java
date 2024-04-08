package HungNguyen;

import java.util.Scanner;

public class Lab01Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cạnh khối lập phương:");
		float a = sc.nextFloat();
		float tt = (float) Math.pow(a, 3);
		System.out.println("Thể tích = " + tt);
	}
}
