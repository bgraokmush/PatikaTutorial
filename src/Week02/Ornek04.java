package Week02;

import java.util.Scanner;

//Reküsif Asal kontrolü
public class Ornek04 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        int number = scanner.nextInt();

        System.out.println(asalMi(number, 2)
                ? number + " Asaldır."
                : number + " Asal değildir.");
    }

    //Asal sayı kontrolü
    public static boolean asalMi(int number, int i){
        if(number <= 2){
            //Sayı 2 ise asaldır
            return (number == 2) ? true : false;
        }
        //Sayı 2 den büyükse ve i ye bölünüyorsa asal değildir
        if(number % i == 0){
            return false;
        }
        //Sayı 2 den büyükse ve i nin karesi sayıdan büyükse asaldır
        if(i * i > number){
            return true;
        }
        return asalMi(number, i + 1);
    }
}
