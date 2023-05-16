package Week01;

// ∑(1, infinity) = 1 + 1/2 + 1/3 + ...  + 1/n

import java.util.Scanner;

public class Odev22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        double toplam = 0;

        for (double i = 1; i <= sayi; i++) {
            toplam += 1/i;
        }
        System.out.println("Toplam: " + toplam);
    }
}
