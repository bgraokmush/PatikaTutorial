package Week01;

import java.util.Scanner;

/*
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
Formül: Kilo (kg) / Boy(m) * Boy(m)
    */
public class Odev01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        double height = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        double weight = scanner.nextDouble();

        System.out.println("Vücut Kitle İndeksiniz : " + bodyMassIndex(height,weight));
    }

    public static double bodyMassIndex(double height, double weight){
        return weight / (height*height);
    }
}
