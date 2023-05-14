package Week01;

import java.util.Scanner;

/*
    Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
    ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa
    "Şifre oluşturuldu" yazan programı yazınız.
*/
public class Odev09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sifre = "12345";
        System.out.println("Şifrenizi giriniz: ");
        String girilenSifre = scanner.nextLine();

        if(sifre.equals(girilenSifre)){
            System.out.println("Giriş başarılı.");
        }else{
            System.out.println("Şifre değiştirmek ister misiniz? (E/H)");
            String cevap = scanner.nextLine();
            if(cevap.charAt(0) == 'E'){
                System.out.println("Yeni şifrenizi giriniz: ");
                String yeniSifre = scanner.nextLine();
                if(sifre.equals(yeniSifre)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else{
                    System.out.println("Şifre oluşturuldu.");
                }
            }
            System.out.println("Çıkış yapılıyor...");
        }
    }
}
