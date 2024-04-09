package HungNguyen;

import java.util.Scanner;

public class Lab02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
			System.out.println("++ ----------------------------------------- ++");
			System.out.println("| 1. Giải phương trình bậc nhất |");
			System.out.println("| 2. Giải phương trình bậc hai |");
			System.out.println("| 3. Tính số tiền điện |");
			System.out.println("| 4. Kết thúc |");
			System.out.println("Lựa chọn của bạn là : ");
			System.out.println("++ ------------------ ++");
			int c = sc.nextInt();
			if (c == 1) {
				System.out.println("GPTBN");
				int a = sc.nextInt(), b = sc.nextInt();
				if (a == 0 && b == 0) {
					System.out.println("VSN");
				} else if (a == 0 && b != 0) {
					System.out.println("VN");
				} else {
					float x = (float) -b / a;
					System.out.printf("Phuong trinh co nghiem la: x = %.3f \n", x);
				}
			} else if (c == 2) {
				System.out.println("GPTBH");
				int a = sc.nextInt(), b = sc.nextInt(), z = sc.nextInt();
				if (a == 0) {
					if (b == 0 && z == 0) {
						System.out.println("VSN");
					} else if (b == 0 && z != 0) {
						System.out.println("VN");
					} else {
						float x = (float) -z / b;
						System.out.println("Phuong trinh co nghiem la: x = %.3f \n" + x);
					}
				} else {
					double delta = Math.pow(b, 2) - 4 * a * c;
					if (delta < 0)
						System.out.println("VN");
					else if (delta == 0) {
						double x = (double) -b / (2 * a);
						System.out.println("PT co nghiem kep: %.3f" + (x));
					} else {
						double x1 = (-b + Math.sqrt(delta) / (2 * a));
						double x2 = (-b + Math.sqrt(delta) / (2 * a));
						System.out.printf("PT co 2 nghiem phan biet: x1 = %.3f, x2 = %.3f", x1, x2);
					}
				}
			} else if (c == 3) {
				System.out.println("Số điện tiêu thụ: ");
				float sd = sc.nextFloat();
				float hd = 1;
				if (sd <= 100) {
					hd = sd * 1000;
				} else {
					hd = 100 * 1000 + (sd - 100) * 1500;
				}
				System.out.println("Hoa don tien dien cua ban la: " + hd);
			} else {
				System.out.println("Bạn đã thoát khỏi chương trình");
				System.exit(0);
			}
		}
	}
}
