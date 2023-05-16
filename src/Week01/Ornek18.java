package Week01;

import java.util.Scanner;

/*
    Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
    çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
*/
public class Ornek18 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int toplam = 0;

        while (true) {
            System.out.print("Sayi giriniz: ");
            int sayi = s.nextInt();

            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }
            else if(sayi % 2 != 0){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            System.out.println("\tToplam->" + toplam);
        }
    }
}
