package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Hãy nhập số đầu : ");
        int start = sc.nextInt();
        System.out.println(" Hãy nhập số cuối : ");
        int end = sc.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i%2==0){
                sum += i;
            }
        }
        System.out.println("Tổng các số chẵn trong khoảng từ " + start + " đến " + end + " là: " + sum);
    }
}
