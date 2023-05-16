package Week01;

import java.util.Date;
import java.util.Scanner;

/*
    Burç bulan program
    Koç Burcu  : 21 Mart - 20 Nisan
    Boğa Burcu  : 21 Nisan - 21 Mayıs
    İkizler Burcu  : 22 Mayıs - 22 Haziran
    Yengeç Burcu  : 23 Haziran - 22 Temmuz
    Aslan Burcu  : 23 Temmuz - 22 Ağustos
    Başak Burcu  : 23 Ağustos - 22 Eylül
    Terazi Burcu  : 23 Eylül - 22 Ekim
    Akrep Burcu  : 23 Ekim - 21 Kasım
    Yay Burcu  : 22 Kasım - 21 Aralık
    Oğlak Burcu  : 22 Aralık - 21 Ocak
    Kova Burcu  : 22 Ocak - 19 Şubat
    Balık Burcu  : 20 Şubat - 20 Mart
*/
public class Odev13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğum tarihinizi giriniz (1 Ocak 2002):");
        String birthDate = scanner.nextLine();
        String[] birthDateArray = birthDate.split(" ");
        int day = Integer.parseInt(birthDateArray[0]);
        int month = monthCount(birthDateArray[1]);
        int year = Integer.parseInt(birthDateArray[2]);

        if (day >= 21 && month == 3 || day <= 20 && month == 4) {
            System.out.println("Koç Burcu");
        }
        if(day >= 21 && month == 4 || day <= 21 && month == 5){
            System.out.println("Boğa Burcu");
        }
        if(day >= 22 && month == 5 || day <= 22 && month == 6) {
            System.out.println("İkizler Burcu");
        }
        if(day >= 23 && month == 6 || day <= 22 && month == 7) {
            System.out.println("Yengeç Burcu");
        }
        if(day >= 23 && month == 7 || day <= 22 && month == 8) {
            System.out.println("Aslan Burcu");
        }
        if(day >= 23 && month == 8 || day <= 22 && month == 9) {
            System.out.println("Başak Burcu");
        }
        if(day >= 23 && month == 9 || day <= 22 && month == 10) {
            System.out.println("Terazi Burcu");
        }
        if(day >= 23 && month == 10 || day <= 21 && month == 11) {
            System.out.println("Akrep Burcu");
        }
        if(day >= 22 && month == 11 || day <= 21 && month == 12) {
            System.out.println("Yay Burcu");
        }
        if(day >= 22 && month == 12 || day <= 21 && month == 1) {
            System.out.println("Oğlak Burcu");
        }
        if(day >= 22 && month == 1 || day <= 19 && month == 2) {
            System.out.println("Kova Burcu");
        }
        if(day >= 20 && month == 2 || day <= 20 && month == 3) {
            System.out.println("Balık Burcu");
        }
    }

        public static int monthCount (String s){
            String[] months = {"Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran",
                    "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};
            for (int i = 0; i < months.length; i++) {
                if (s.equals(months[i])) {
                    return i + 1;
                }
            }
            return -1;
        }

}
