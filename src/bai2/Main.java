package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. In hình chữ nhật (Rectangle)\n" +
                    "2. In hình tam giác vuông góc vuông ở 4 góc khác nhau: \n" +
                    "3. In hình tam giác cân ( Isosceles triangle)\n" +
                    "4. Exit\n");
            System.out.println("Hãy nhập vào lựa chọn");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    // hiển thị hình chữ nhật
                    System.out.println("nhập chiều dài :");
                    int D = Integer.parseInt(sc.nextLine());
                    System.out.println("nhập chiều rộng :");
                    int R = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < D; i++) {
                        for (int j = 0; j < R; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    // hiển thị tam giác vuông theo menu
                    System.out.println("a. Trên cùng bên trái (top-left) \n" +
                            "b. Trên cùng bên phải( top-right)\n" +
                            "c. Dưới cùng bên trái( bottom-left) \n" +
                            "d. Dưới cùng bên phải(bottom-right)\n");
                    System.out.println("nhập lựa chọn của bạn");
                    String next = sc.nextLine();
                    switch (next) {
                        case "a":
                            for (int i = 5; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print(" * ");
                                }
                                System.out.println();
                            }
                            break;
                        case "b":
                            for (int i = 0; i < 5; i++) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print("  ");
                                }
                                for (int k = i; k < 5; k++) {
                                    System.out.print(" * ");
                                }
                                System.out.println();
                            }
                            break;
                        case "c":
                            for (int i = 0; i <= 5; i++) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print(" * ");
                                }
                                System.out.println();
                            }
                            break;
                        case "d":
                            for (int i = 5; i >= 0; i--) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print(" ");
                                }
                                for (int k = 5; k >= i; k--) {
                                    System.out.print(" * ");
                                }
                                System.out.println();
                            }
                            break;
                    }
                    break;
                case 3:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 7; j++) {
                            if ((j <= 3 + i) && (j >= 3 - i)) {
                                System.out.print(" * ");
                            } else {
                                System.out.print("   ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("thoát chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Hay Nhap Lua Chon Dung!");
                    break;
            }
        }
    }
}
