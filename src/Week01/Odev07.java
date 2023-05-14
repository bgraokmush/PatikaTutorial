package Week01;

/*
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram
değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
*/

import java.util.Scanner;

public class Odev07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5;

        System.out.print("Armut kaç kilo?-> ");
        double armutKilo = scanner.nextDouble();

        System.out.print("Elma kaç kilo?-> ");
        double elmaKilo = scanner.nextDouble();

        System.out.print("Domates kaç kilo?-> ");
        double domatesKilo = scanner.nextDouble();

        System.out.print("Muz kaç kilo?-> ");
        double muzKilo = scanner.nextDouble();

        System.out.print("Patlıcan kaç kilo?-> ");
        double patlicanKilo = scanner.nextDouble();

        double toplam = (armut*armutKilo)+(elma*elmaKilo)+(domates*domatesKilo)+(muz*muzKilo)+(patlican*patlicanKilo);
        System.out.println("Toplam tutar ->"+ toplam);
    }
}
