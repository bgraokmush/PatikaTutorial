package Week01;

import java.util.Scanner;

/*
    Bir sayının kendisi hariç pozitif tam sayı çarpanları
    (kalansız bölen sayıların) toplamı kendisine eşit olan
    sayıya mükemmel sayı denir.


    Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını
    bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
    değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan
    programı Java dilinde yazınız.
*/
public class Odev27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz:");
        int sayi = scanner.nextInt();
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (toplam == sayi) {
            System.out.println("Mukemmel sayidir.");
        } else {
            System.out.println("Mukemmel sayi degildir.");
        }
    }
}
