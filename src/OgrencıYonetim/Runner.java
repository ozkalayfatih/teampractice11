package OgrencıYonetim;

import java.util.ArrayList;
import java.util.List;

public class Runner {// bu class  tüm variable ve mathod2ları kullanacağımız class olduğu için main method'u
    // burada oluşturduk

    public static void main(String[] args) {
        List<Ogrenci> ogrenciList=new ArrayList<>();// önce bir öğrenci listesi oluşturduk başta görebilmek adına
        // kendimiz 3 tane öğrenci ekledik
        Ogrenci ogrenci1=new Ogrenci("Ali","Karsu",15,201,"9-A","1234");
        ogrenciList.add(ogrenci1);
        Ogrenci ogrenci2=new Ogrenci("Ayşe","Melek",14,205,"9-A","5678");
        ogrenciList.add(ogrenci2);
        Ogrenci ogrenci3=new Ogrenci("Mert","Yılmaz",15,208,"9-B","1579");
        ogrenciList.add(ogrenci3);
        MethodMenu method1=new MethodMenu();// burada da menu method'undan bir obje oluşturduk ki menüdeki method'ları
        // bu obje üzerinden kullanabilelim
        method1.menuMethodu(ogrenciList);
    }
}