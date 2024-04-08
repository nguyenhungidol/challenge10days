package HungNguyen;

import java.util.Scanner;

public class Lab01Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Chiều dài HCN:");
		float cd = sc.nextFloat();
		System.out.println("Chiều rộng HCN:");
		float cr = sc.nextFloat();
		float cv = (cd + cr) * 2;
		System.out.println("CV HCN = " + cv);
		float dt = cd * cr;
		System.out.println("DT HCN = " + dt);
		System.out.println("Cạnh NN = " + cr);
	}
}
