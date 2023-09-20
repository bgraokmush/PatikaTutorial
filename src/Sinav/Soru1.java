package Sinav;


import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Soru1 {
    public static void main(String[] args) {
        File dosya = new File("sinav.txt");
        try {
            PrintWriter p = new PrintWriter(new FileOutputStream(dosya,false)); // Dosyaya ekleme modunda yazmak için true parametresi kullanılır
            for (int i = 1; i < 1000; i += 5) {
                if (i % 5 == 0)
                    p.println(i); // Sayıyı dosyaya yazdırırken yeni satıra geçmek için println() metodu kullanılır
            }
            p.close();
        } catch (Exception e) {
            e.printStackTrace(); // Hata durumunda hata mesajını yazdırıyoruz
        }
    }
}



