package PracticeSorular;


    /*
        kullanıcıdan aldığın bir stringin uzunluğu çift bir sayıysa tam ortasına :)
 yazdır
        yok tek sayıysa tam ortadaki harfi silip yerine üzgün yüz yazdır
         */
    import java.util.Scanner;

    public class cccc {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Lütfen bir kelime veya cümle giriniz: ");
            String kelime = input.nextLine();

            int uzunluk = kelime.length();

            if (uzunluk % 2 == 0) {
                int orta = uzunluk / 2;

                String ortadakiKarakterler = kelime.substring(orta - 1, orta + 1);
                System.out.println("Ortadaki karakterler: " + ortadakiKarakterler);
            } else {
                int orta = uzunluk / 2;
                String yeniKelime = kelime.substring(0, orta) + "😞" + kelime.substring(orta + 1);
                System.out.println("Yeni kelime: " + yeniKelime);
            }

            input.close();
        }
    }


