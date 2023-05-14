package Week01;

/*
    Switch-Case kullanarak hesap makinesi yapınız.
*/

import java.util.Scanner;

public class Odev08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz: ");
        double sayi1 = scanner.nextDouble();
        System.out.println("2. sayıyı giriniz: ");
        double sayi2 = scanner.nextDouble();
        System.out.println("İşlemi giriniz: ");
        char islem = scanner.next().charAt(0);

        switch (islem) {
            case '+':
                System.out.println("Toplam: " + (sayi1 + sayi2));
                break;
            case '-':
                System.out.println("Fark: " + (sayi1 - sayi2));
                break;
            case '*':
                System.out.println("Çarpım: " + (sayi1 * sayi2));
                break;
            case '/':
                if (sayi2 == 0) {
                    System.out.println("Bir sayı 0'a bölünemez.");
                    break;
                }
                System.out.println("Bölüm: " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("Hatalı işlem girdiniz.");
                break;
        }
    }
}
