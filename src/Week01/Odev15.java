package Week01;
/*
    Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

    Doğum Tarihi %12 = 0 ➜ Maymun
    Doğum Tarihi %12 = 1 ➜ Horoz
    Doğum Tarihi %12 = 2 ➜ Köpek
    Doğum Tarihi %12 = 3 ➜ Domuz
    Doğum Tarihi %12 = 4 ➜ Fare
    Doğum Tarihi %12 = 5 ➜ Öküz
    Doğum Tarihi %12 = 6 ➜ Kaplan
    Doğum Tarihi %12 = 7 ➜ Tavşan
    Doğum Tarihi %12 = 8 ➜ Ejderha
    Doğum Tarihi %12 = 9 ➜ Yılan
    Doğum Tarihi %12 = 10 ➜ At
    Doğum Tarihi %12 = 11 ➜ Koyun
*/

import java.util.Scanner;

public class Odev15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Doğum Yılınızı Giriniz: ");
        int dogumYili = scanner.nextInt();
        if(dogumYili < 0)
            System.out.println("Hatalı Veri Girdiniz !");
        else
            System.out.println("Çin Zodyağı Burcunuz: " + getChineseZodiac(dogumYili));
    }

    public static String getChineseZodiac(int yil){
        String[] zodyak = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};
        return zodyak[yil % 12];
    }
}
