package PracticeSorular;

import java.util.Scanner;

public class orta {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String girilenKelime = scan.next();
        int uzunluk = girilenKelime.length();
        StringBuilder yeni=new StringBuilder(girilenKelime);

        if (uzunluk % 2 == 0) {
            girilenKelime = (girilenKelime.substring(0, uzunluk / 2) + " :) " + (girilenKelime.substring(uzunluk / 2)));
            System.out.println(girilenKelime);
        } else {
            int orta=uzunluk/2;
            yeni.delete(orta,orta+1); //ortayı bulup siliyoruz.
            yeni.insert(orta,":("); //ortaya istediğimiz karakteri ekliyoruz
            System.out.println("delete="+yeni);
            yeni.replace(orta,orta,":(");// direk ortayı bulup yer değiştiriyoruz (doğru çalışması için bir üstedikini yoruma çevirmek gerekiyor
            System.out.println("replace = " + yeni);
            yeni.setCharAt(orta,'&'); //replace gibi çalışıyor char ekliyor
            System.out.println("setchar = " + yeni);
            girilenKelime = (girilenKelime.substring(0, uzunluk / 2) + " :( " + (girilenKelime.substring(uzunluk / 2 + 1)));
            System.out.println(girilenKelime);
        }
    }
}
