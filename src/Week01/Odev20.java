package Week01;

import java.util.Scanner;

/*
    Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
*/
public class Odev20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        int sayi = scanner.nextInt();
        System.out.println("Sonuç->" + sayi + " sayısının\n4'ün kuvvetleri: " + kuvvet(sayi, 4) + "\n5'in Kuvvetleri: " + kuvvet(sayi, 5));

        System.out.println("Sayi giriniz: ");
        int sayi2 = scanner.nextInt();
        System.out.println("\nKombinasyon Hesaplama: " + kombinasyon(sayi, sayi2));
    }

    public static String kuvvet(int sayi, int kat){
        String sonuc = "";
        for (int i = 0; i <= sayi; i+=kat) {
            sonuc += i + ", ";
        }
        return sonuc;
    }

    //Faktöriyel hesaplama
    public static int faktoriyel(int sayi){
        int sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    //Kombinasyon hesaplama
    public static int kombinasyon(int n, int r){
        return faktoriyel(n) / (faktoriyel(r) * faktoriyel(n-r));
    }
}
