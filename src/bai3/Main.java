package bai3;

public class Main {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            if (i <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println("Số nguyên tố là: " + i);
            }
        }
    }
}
