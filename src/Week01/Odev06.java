package Week01;
/*
    Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire
    diliminin alanı bulan programı yazınız.
    𝜋 sayısını = 3.14 alınız.
    Formül : (𝜋 * (r*r) * 𝛼) / 360
**/

import java.util.Scanner;

public class Odev06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Daire diliminin alanını hesaplamak için lütfen yarıçapı ve merkez açısının ölçüsünü giriniz.");
        double r = scanner.nextDouble(), alpha = scanner.nextDouble();
        double pi = 3.14;
        double alan = (pi * (r*r) * alpha) / 360;
        System.out.println("Daire diliminin alanı -> " + alan);
    }
}
