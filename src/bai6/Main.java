package bai6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Kiem tra tinh chan le");
            System.out.println("2. Kiem tra so nguyen to");
            System.out.println("3. Kiem tra 1 so co chia het cho 3 khong");
            System.out.println("4. Thoat");
            System.out.println("Hay nhap lua chon cua ban");

            // Xử lý ngoại lệ nếu người dùng nhập không phải số nguyên
            if (!sc.hasNextInt()) {
                System.out.println("Nhap khong hop le. Vui long nhap lai.");
                sc.next(); // Đọc và bỏ qua giá trị không hợp lệ
                continue;
            }

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Hay nhap so can kiem tra:");
                    int number1 = sc.nextInt();
                    if (number1 % 2 == 0) {
                        System.out.println(number1 + " la so chan");
                    } else {
                        System.out.println(number1 + " la so le");
                    }
                    break;
                case 2:
                    // Kiem tra so nguyen to
                    System.out.println("Hay nhap so can kiem tra:");
                    int number2 = sc.nextInt();
                    boolean isPrime = true;
                    if (number2 <= 1) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i <= Math.sqrt(number2); i++) {
                            if (number2 % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    if (isPrime) {
                        System.out.println("So nguyen to la: " + number2);
                    } else {
                        System.out.println("Khong phai la so nguyen to");
                    }
                    break;
                case 3:
                    // Kiem tra so co chia het cho 3 khong
                    System.out.println("Hay nhap so can kiem tra:");
                    int number3 = sc.nextInt();
                    if (number3 % 3 == 0) {
                        System.out.println("So chia het cho 3");
                    } else {
                        System.out.println("So khong chia het cho 3");
                    }
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh");
                    sc.close(); // Đóng Scanner trước khi thoát
                    System.exit(0);
                default:
                    System.out.println("Nhap khong hop le");
            }
        }
    }
}
