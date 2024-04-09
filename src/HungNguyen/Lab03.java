package HungNguyen;

import java.util.Arrays;
import java.util.Scanner;

public class Lab03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Bài 1
		int n;
		System.out.println("Nhập số nguyên n: ");
		n = sc.nextInt();
		boolean check = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("N là số nguyên tố");
		} else {
			System.out.println("Không!");
		}
		// Bài 2
		System.out.println("Nhập x: ");
		int x = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d \n", x, i, x * i);
		}
		// Bài 3
		int[] a = new int[5];
		System.out.println("Nhập các phần tử của mảng:");
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Số nhỏ nhất mảng: " + a[0]);
		System.out.println("Số lớn nhất mảng: " + a[a.length - 1]);
	}
}
