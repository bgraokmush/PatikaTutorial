package Week02;

import java.util.Scanner;

/*
   Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi
   yapıyoruz.
*/
public class Ornek02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);

    }

    //Toplama işlemi
    public static void plus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç sayı toplayacaksınız :");
        int count = scanner.nextInt();
        int total = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". sayıyı giriniz :");
            int number = scanner.nextInt();
            total += number;
        }
        System.out.println("Toplam : " + total);
    }

    //Çıkarma işlemi
    public static void minus(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç sayı çıkaracaksınız :");
        int count = scanner.nextInt();
        int total = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". sayıyı giriniz :");
            int number = scanner.nextInt();
            if(i == 1)
                total = number;
            else
                total -= number;
        }
        System.out.println("Sonuç : " + total);
    }

    //Çarpma işlemi
    public static void times(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç sayı çarpacaksınız :");
        int count = scanner.nextInt();
        int total = 1;
        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". sayıyı giriniz :");
            int number = scanner.nextInt();
            total *= number;
        }
        System.out.println("Sonuç : " + total);
    }

    //Bölme işlemi
    public static void divided(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bölünen sayıyı giriniz :");
        int number1 = scanner.nextInt();
        System.out.print("Bölen sayıyı giriniz :");
        int number2 = scanner.nextInt();
        System.out.println("Sonuç : " + (number1 / number2));
    }

    //Üslü sayı hesaplama
    public static void power(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban sayıyı giriniz :");
        int number1 = scanner.nextInt();
        System.out.print("Üs sayıyı giriniz :");
        int number2 = scanner.nextInt();
        int total = 1;
        for (int i = 1; i <= number2; i++) {
            total *= number1;
        }
        System.out.println("Sonuç : " + total);
    }

    //Faktöriyel hesaplama
    public static void factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktöriyeli alınacak sayıyı giriniz :");
        int number = scanner.nextInt();
        int total = 1;
        for (int i = 1; i <= number; i++) {
            total *= i;
        }
        System.out.println("Sonuç : " + total);
    }

    //Mod alma
    public static void mod(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Modu alınacak sayıyı giriniz :");
        int number1 = scanner.nextInt();
        System.out.print("Mod sayısını giriniz :");
        int number2 = scanner.nextInt();
        System.out.println("Sonuç : " + (number1 % number2));
    }

    //Dikdörtgen alan ve çevre hesabı
    public static void rectangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dikdörtgenin kısa kenarını giriniz :");
        int number1 = scanner.nextInt();
        System.out.print("Dikdörtgenin uzun kenarını giriniz :");
        int number2 = scanner.nextInt();
        System.out.println("Alan : " + (number1 * number2));
        System.out.println("Çevre : " + (2 * (number1 + number2)));
    }


}
