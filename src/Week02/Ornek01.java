package Week02;

import java.util.Scanner;

/*
Girilen sayının palindrom olup olmadığını bulan metod
*/
public class Ornek01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı girin-> ");
        int number = scanner.nextInt();
        System.out.println(isPalindrom(number));
    }

    //Sayının palindrom olup olmadığını bulan metod
    public static String isPalindrom(int number) {
        //Sayı tersine eşitse palindromdur
        if(number == reverse(number))
            return "Palindrom";
        else
            return "Palindrom değil";
    }

    //Sayının tersini bulan metod
    public static int reverse(int number) {
        int reverse = 0;
        //Sayı 0 olana kadar sayının son basamağını alıp tersine ekliyoruz
        while(number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }
}
