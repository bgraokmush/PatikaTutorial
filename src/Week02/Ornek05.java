package Week02;

/*
    Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

    Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında
    ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının
    son değerini ekrana yazdırın. Sayı tekrar kendine eşit olduğunda program duracak.
*/

import java.util.Scanner;

public class Ornek05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int number = scanner.nextInt();
        //Recursive metot çağırılıyor
        recursive(number, number);
    }

    //Recursive metot
    public static void recursive(int number, int i){
        //Sayı 0 dan büyükse 5 çıkarıyoruz ve sayı 0 dan büyük olduğu sürece recursive metotu çağırıyoruz
        if(number > 0) {
            System.out.print(number + " ");
            recursive(number - 5, i);
        }
        else{

            step2(number , i);
        }
    }


    public static void step2(int number, int i){
        if(number <= i){
            System.out.print(number + " ");
            step2(number + 5, i);
        }
    }


}
