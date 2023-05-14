package Week01;

import java.util.Scanner;
/*
 * Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve
 * ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
 * */

class Ders{
    int vizeNot;
    int finalNot;
    String dersAd;

    public Ders( String dersAd, int vizeNot, int finalNot) {
        this.vizeNot = vizeNot;
        this.finalNot = finalNot;
        this.dersAd = dersAd;
    }

    public double ortalama(){
        return 0.4*vizeNot + 0.6*finalNot;
    }
}

public class Odev02 {

    public static void main(String[] args) {
        Ders[] dersler = new Ders[6];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < dersler.length; i++) {
            System.out.println("Ders adı, vize, final girin ->");
            dersler[i] = new Ders(scanner.next(), scanner.nextInt(), scanner.nextInt());
        }
        for (Ders ders : dersler) {
            System.out.println(ders.dersAd + "---------------> \nvize->" + ders.vizeNot + "\nfinal->" + ders.finalNot + "\nortalama->" + ders.ortalama());
        }
    }
}
