package Week01;

import java.util.Scanner;

/*
    Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
    (Not : KDV tutarını 18% olarak alın)
    KDV'siz Fiyat = 10;
    KDV'li Fiyat = 11.8;
    KDV tutarı = 1.8;
*/
public class Odev03 {

    public static void main(String[] args) {
        double tutar;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ücret tutarını girin->");
        tutar = scanner.nextDouble();

        if(tutar<= 1000){
            System.out.println("KDV tutarı    ->" + (tutar*0.18));
            System.out.println("KDV 'li fiyat ->" + (tutar+(tutar*0.18)));
        }else{
            System.out.println("KDV tutarı    ->" + (tutar*0.08));
            System.out.println("KDV 'li fiyat ->" + (tutar+(tutar*0.08)));
        }

    }
}
