package Week01;

import java.util.Scanner;

/*
    Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
*/
public class Odev17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Sayi giriniz: ");
        int sayi = s.nextInt();
        int toplam = 0;

        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
            }
        }
        System.out.println("Toplam -> " + toplam);
    }
}
