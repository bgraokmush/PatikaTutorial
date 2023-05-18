package Week01;
/*
    Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran
    programı yazınız.
*/
public class Odev29 {
    public static void main(String[] args) {
        for (int i = 2; i <100; i++) {
            if(asalMi(i)){
                System.out.print(i +", ");
            }
        }
    }

    public static boolean asalMi(int sayi){
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
}
