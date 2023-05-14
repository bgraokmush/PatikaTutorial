package Week01;
/*
    Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
    Geçme Notu : 55
    Ödev
    Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
*/

import java.util.Scanner;

public class Odev10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ders[] dersler = new Ders[5];

        System.out.println("Matematik vize ve final notlarınızı giriniz: ");
        dersler[0] = new Ders("Matematik", input.nextInt(), input.nextInt());

        System.out.println("Fizik vize ve final notlarınızı giriniz: ");
        dersler[1] = new Ders("Fizik", input.nextInt(), input.nextInt());

        System.out.println("Türkçe vize ve final notlarınızı giriniz: ");
        dersler[2] = new Ders("Türkçe", input.nextInt(), input.nextInt());

        System.out.println("Kimya vize ve final notlarınızı giriniz: ");
        dersler[3] = new Ders("Kimya", input.nextInt(), input.nextInt());

        System.out.println("Müzik vize ve final notlarınızı giriniz: ");
        dersler[4] = new Ders("Müzik", input.nextInt(), input.nextInt());

        for (int i = 0; i < dersler.length; i++) {
            //Kontrol işlemi ortalama metodu içinde yapıldı.
            System.out.println(dersler[i].dersAd + " dersinden aldığınız ortalama: " + dersler[i].ortalama());
        }

    }
}
