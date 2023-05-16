package Week01;

import java.util.Scanner;

/*
    Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
*/
public class Odev19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int base = scanner.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int exponent = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Sonuç: " + result);
    }
}
