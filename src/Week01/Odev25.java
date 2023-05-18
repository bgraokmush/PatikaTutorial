package Week01;
/*
 Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
 */

import java.util.Scanner;

public class Odev25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İki sayı giriniz : ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int ebob = 1, ekok;
        int i = 1;
        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0)
                ebob = i;
            i++;
        }
        ekok = (n1 * n2) / ebob;
        System.out.println("Ebob : " + ebob);
        System.out.println("Ekok : " + ekok);
    }

}
