package Week01;

import java.util.Scanner;

/*
Java ile klavyeden girilen N tane sayma sayısından en büyük
ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
*/
public class Odev26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kac adet sayi gireceksiniz?");
        int n = scanner.nextInt();
        int max = 0;
        int min = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ". sayiyi giriniz:");
            int sayi = scanner.nextInt();
            if (i == 1) {
                max = sayi;
                min = sayi;
            }
            if (sayi > max) {
                max = sayi;
            }
            if (sayi < min) {
                min = sayi;
            }
        }
        System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: " + min);
    }

}
