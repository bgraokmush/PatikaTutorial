package Week01;
/*
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
Örnek : 1643 = 1 + 6 + 4 + 3 = 14
*/
import java.util.Scanner;

public class Ornek21 {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");

        int number = scanner.nextInt();
        String[] digits = String.valueOf(number).split("");
        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum+=Integer.parseInt(digits[i]);
        }

        System.out.println("Girilen sayının basamakları toplamı: " + sum);
    }
}
