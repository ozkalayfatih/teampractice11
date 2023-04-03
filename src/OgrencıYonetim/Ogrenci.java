package OgrencıYonetim;

public class Ogrenci {
    /*
    öncelikle bir öğrenciden alınmasını istediğimiz tüm bilgileri class level'da variable olarak oluşturuyoruz
    2. olarak bir kalıp(constructor) oluşturup içine istediğimiz parametreleri ekliyoruz
    kendimiz ayrıca bir constructor oluşturduğumuz için extra bir parametresiz constructor oluşturuyoruz
     */
    @Override
    public String toString() {//burada constructor ile oluşturduğumuz bir objenin tüm özelliklerini aynı anda yazdırmak
        // istediğimiz için (toString method'u) ile yazdırıyoruz.
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", yas=" + yas +
                ", numara=" + numara +
                ", sinif='" + sinif + '\'' +
                ", tc='" + tc + '\'' +
                '}';
    }
    public Ogrenci() {
    }

    public String getAd() {
        return ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public int getYas() {
        return yas;
    }

    public int getNumara() {
        return numara;
    }

    public String getSinif() {
        return sinif;
    }

    public String getTc() {
        return tc;
    }

    public Ogrenci(String ad, String soyAd, int yas, int numara, String sinif, String tc) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.yas = yas;
        this.numara = numara;
        this.sinif = sinif;
        this.tc=tc;
    }
    String ad;
    String soyAd;
    int yas;
    int numara;
    String sinif;

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    String tc;
}