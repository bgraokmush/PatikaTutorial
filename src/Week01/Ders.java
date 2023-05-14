package Week01;

public class Ders{
    int vizeNot;
    int finalNot;
    String dersAd;

    public Ders( String dersAd, int vizeNot, int finalNot) {
        this.vizeNot = vizeNot;
        this.finalNot = finalNot;
        this.dersAd = dersAd;
    }

    public double ortalama(){
        double sonuc = 0.4*vizeNot + 0.6*finalNot;
        return  sonuc >100 ? 0 : sonuc;
    }
}
