package Week01;
/*
* Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

    Taksimetre KM başına 2.20 TL tutmaktadır.
    Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    Taksimetre açılış ücreti 10 TL'dir.
*/

public class Odev05 {
    public static void main(String[] args) {
        double km = 10;
        double perKm = 2.20;
        double total = 10 + (km * perKm);
        total = (total < 20) ? 20 : total;
        System.out.println("Total: " + total);
    }
}
