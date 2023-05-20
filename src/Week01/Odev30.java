package Week01;

import java.util.Scanner;

/*
    Java döngüler ile fibonacci serisi bulan program yazıyoruz.
    Fibonacci serisinin eleman sayısını kullanıcıdan alın.
*/
public class Odev30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fibonacci serisinin eleman sayisini giriniz:");
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + ", " + b);
        for (int i = 2; i <= n; i++) {
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }

}
