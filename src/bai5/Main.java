package bai5;

public class Main {
    public static void main(String[] args) {
        int n = 1;
        while(n>0) {
            if (n%5==0 && n%7== 0 && n%11==0) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}
