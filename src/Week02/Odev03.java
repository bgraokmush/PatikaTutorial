package Week02;

import java.util.Scanner;

public class Odev03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üst almak istediğiniz sayıyı giriniz :");
        int number = scanner.nextInt();
        System.out.println("Üssü giriniz :");
        int power = scanner.nextInt();
        System.out.println("Sonuç -> " + ustAl(number, power));
    }

    //Üslü sayı hesaplama
    public static int ustAl(int number, int power){
        //Üs 0 ise 1 döndürüyoruz
        if(power == 0){
            return 1;
        }
        else{
            return number * ustAl(number, power - 1);
        }
    }
}
