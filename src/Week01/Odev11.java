package Week01;
/*
    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
*/

import java.util.Scanner;

public class Odev11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sıcaklık değerini giriniz-> ");
        int sicaklik = scanner.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak");
        } else if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Sinema");
        } else if (sicaklik > 15 && sicaklik <= 25) {
            System.out.println("Piknik");
        } else {
            System.out.println("Yüzme");
        }
    }
}
