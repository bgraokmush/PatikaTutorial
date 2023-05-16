package Week01;

import java.util.Scanner;

/*
    Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk
    tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını
    hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

    Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
    Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
    Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/
public class Odev14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi giriniz (Metre): ");
        int mesafe = scanner.nextInt();

        if(mesafe < 0)
            System.out.println("Hatalı Veri Girdiniz !");

        System.out.println("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        if(yas < 0)
            System.out.println("Hatalı Veri Girdiniz !");

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş-Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        if(yolculukTipi != 1 && yolculukTipi != 2)
            System.out.println("Hatalı Veri Girdiniz !");

        double toplamTutar = mesafe * 0.10;

        if(yolculukTipi == 2) {
            toplamTutar *= 2;
            toplamTutar *= 0.8;
        }
        else if (yas < 12)
            toplamTutar *= 0.5;
        else if (yas >= 12 && yas <= 24)
            toplamTutar *= 0.9;
        else if (yas >= 65)
            toplamTutar *= 0.7;

        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
    }
}
