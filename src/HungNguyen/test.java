package HungNguyen;

import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		int[] a = { 1, 5, 3, 2, 4 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
