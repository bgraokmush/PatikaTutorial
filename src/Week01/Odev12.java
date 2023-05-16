package Week01;
/*
 Girilen sayı dizisini küçükten büyüğe sırala
*/

public class Odev12 {

    public static void main(String[] args) {
        int[] sayilar = {1, 2, 5, 7, 9, 0, 3, 4, 6, 8};
        int temp = 0;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = i + 1; j < sayilar.length; j++) {
                if (sayilar[i] > sayilar[j]) {
                    temp = sayilar[i];
                    sayilar[i] = sayilar[j];
                    sayilar[j] = temp;
                }
            }
        }
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i] + " ");
        }
    }
}
