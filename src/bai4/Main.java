package bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập 1 số:");
        int number = sc.nextInt();
        int count = 0;
        int n = 2;
        while (count < number) {
            boolean isPrime = true;
            if (n <=1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(n);
                    count++;
                }
            }
            n++;
        }
    }
}
