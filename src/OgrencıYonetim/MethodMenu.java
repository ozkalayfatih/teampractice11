package OgrencıYonetim;

import java.util.List;
import java.util.Scanner;

public class MethodMenu {/*
    ÖĞRENCİ YÖNETİM PLATFORMU KODLAYINIZ.
1. BU PROGRAMDA ÖĞRENCİ KAYITLARI İLE İLGİLİ İŞLEMLER YAPILABİLMEKTEDİR.
KAYITLARDA ŞU BİLGİLER OLMALIDIR:
    -AD SOYAD
    -KİMLİK NO
    -YAŞ
    -NUMARA
    -SINIF  BİLGİLERİNİ İÇERMELİDİR.
2. ============= İŞLEMLER =============
         1-EKLEME
         2-ARAMA
         3-LİSTELEME
         4-SİLME
         Q-ÇIKIŞ
    SEÇİMİNİZ:
  ŞEKLİNDE BİR MENÜ OLUŞTURULMALI.
3. ARAMA VE SİLME İŞLEMLERİ KİMLİK NO YA GÖRE YAPILMALIDIR.
NOT: PROJEYİ YAPARKEN NESNE YÖNELİMLİ PROGRAMLAMANIN BİZE SAĞLADIĞI İMKANLARI KULLANMAYA DİKKAT EDİNİZ.
     */
    Scanner scan=new Scanner(System.in);
    public  void menuMethodu( List<Ogrenci> ogrenciList){// genel bir method oluşturup diğer işlem method'larını bu
        // method'un içinde oluşturacağız
        System.out.println("lütfen yapmak istediginiz islemi seciniz");

        System.out.println((" ============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         Q-ÇIKIŞ "));
        System.out.print("SEÇİMİNİZ=");
        char islem= scan.next().charAt(0);// işlemler menüsündeki basamakları tek tek girebilmesi için char olan bir
        // variable oluşturuldu.int almamamızın sebebi çıkış için Q'ya basılması gerektiğidir.
        switch (islem){// bu switch içinde metodları tek tek oluşturacağız
            case '1':
                ekleme(ogrenciList);//bu methodun içinde öğrenci listesini ekleme yapabilmemiz için istediğimiz listeyi
                // parametreyi girmek gerektiğinden dolayı bu method'u oluşturduk
                System.out.println("ÖĞRENCİ BAŞARI İLE KAYDEDİLDİ");
                menuMethodu(ogrenciList);
            case '2':
                arama(ogrenciList);
                menuMethodu(ogrenciList);
            case '3':
                listeleme(ogrenciList);
                menuMethodu(ogrenciList);
            case '4':
                silme(ogrenciList);
                menuMethodu(ogrenciList);
            case 'Q':
            case 'q':
                System.exit(0);
            default:System.out.println("YANLIŞ DEĞER GİRDİNİZ: ");
                menuMethodu(ogrenciList);
        }
    }

    private void silme(List<Ogrenci> ogrenciList) {
        int flag=0;
        System.out.print("SİLİNECEK NO YU GİRİNİZ: ");
        int silinecekNo=scan.nextInt();
        for (int i = 0; i < ogrenciList.size(); i++) {
            if (silinecekNo==ogrenciList.get(i).getNumara()){
                ogrenciList.remove(i);
                flag=1;
                listeleme(ogrenciList);
            }
        }
        if (flag==0){
            System.out.println("ARADIĞINIZ NO YA AİT ÖĞRENCİ YOKTUR..");
            menuMethodu(ogrenciList);
        }
        menuMethodu(ogrenciList);

    }

    public void arama(List<Ogrenci> ogrenciList) {
        int flag = 0;
        System.out.print("ARAMA YAPILACAK OGRENCİ NO: ");
        int aranacakNo = scan.nextInt();
        for (Ogrenci each : ogrenciList) {
            if (aranacakNo==each.getNumara()) {
                System.out.println("ARADIĞINIZ ÖĞRENCİNİN BİLGİLERİ\n" + each);
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("ARADIĞINIZ NO YA AİT ÖĞRENCİ YOKTUR..");
            menuMethodu(ogrenciList);
        }
        menuMethodu(ogrenciList);

    }

    public void listeleme(List<Ogrenci> ogrenciList) {
        for (Ogrenci each: ogrenciList) {
            System.out.println(each);

        }

    }

    public void ekleme(List<Ogrenci> ogrenciList) {
        /*
        kullanıcıdan öğrencinin bilgilerini tek tek alıyoruz
         */
        int no=100;
        scan.nextLine();
        System.out.print("lutfen ogrenci ismini girin ");
        String ad= scan.nextLine();
        System.out.print("lutfen ogrenci soy ismini girin ");
        String soyAd= scan.nextLine();
        System.out.print("lutfen ogrenci yasini girin ");
        int yas= scan.nextInt();
        System.out.print("lutfen ogrenci sınıfını girin ");
        String sinif= scan.next();
        System.out.print("lutfen ogrenci Tc numarasını girin ");
        String tc= scan.next();
        Ogrenci ogr=new Ogrenci(ad,soyAd,yas,no++,sinif,tc);
        ogrenciList.add(ogr);// öğrenci class'ından bir obje oluşturup kendi oluşturduğumuz parametreli constructor ile
        // öğrenci bilgilerini atayabiliyoruz.Sonra oluşturduğumuz bu öğrenci listesini öğrenciyi ekliyoruz

    }
}









