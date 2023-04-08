package PracticeSorular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir kelime veya cümle giriniz: ");
        String kelime = input.nextLine();
        int uzunluk = kelime.length();
        StringBuilder yeni=new StringBuilder(kelime);

        
        if (uzunluk % 2 == 0) {
            int orta = uzunluk / 2;
            String yeniKelime = kelime.substring(0, orta) + ":)" + kelime.substring(orta + 1);
            System.out.println("Yeni kelime: " + yeniKelime);
        } else {
            int orta = uzunluk / 2;
            yeni.delete(orta,orta+1); //ortayı bulup siliyoruz.
            yeni.insert(orta,":("); //ortaya istediğimiz karakteri ekliyoruz
            System.out.println("delete="+yeni);
            yeni.replace(orta,orta,":(");// direk ortayı bulup yer değiştiriyoruz
            System.out.println("replace = " + yeni);
            yeni.setCharAt(orta,'&'); //replace gibi çalışıyor char ekliyor
            System.out.println("setchar = " + yeni);
            String yeniKelime = kelime.substring(0, orta) + ":(" + kelime.substring(orta + 1);
            System.out.println("substring: " + yeniKelime);
        }
        

    }
}