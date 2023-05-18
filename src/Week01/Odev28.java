package Week01;

import java.util.Scanner;

/*
    Java ile basamak sayısının kullanıcıdan alınan ve döngüler
    kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen
    programı yazın.
*/
public class Odev28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Basamak sayisini giriniz:");
        int basamak = scanner.nextInt();
        for (int i = basamak; i >= 1; i--) {
            for (int j = 1; j <= basamak - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
