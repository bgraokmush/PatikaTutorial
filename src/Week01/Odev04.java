package Week01;

import java.util.Scanner;

/*
    Ödev:

    Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin
    alanını hesaplayan programı yazınız.

    Formül
    Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
    𝑢 = (a+b+c) / 2
    Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
*/
public class Odev04 {

    public static void main(String[] args) {
        System.out.println("Üçgenin kenarlarını girin-> ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(), b=scanner.nextDouble(), c=scanner.nextDouble();
        double cevre = (a+b+c)/2;
        double alan = Math.sqrt(cevre*(cevre-a)*(cevre-b)*(cevre-c));

        System.out.println("Üçgenin alanı-> " + alan);
    }
}
