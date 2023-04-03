package PracticeSorular;

public class c01_ogrenciTestCevap {
    public static int dogruSayisi(char[] cevaplar, char[] anahtar) {
        int dogru = 0;
        for (int i = 0; i < cevaplar.length; i++) {
            if (cevaplar[i] == anahtar[i]) {
                dogru++;
            }
        }
        return dogru;
    }

    public static void main(String[] args) {
        char[][] cevaplar = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        char[] anahtar = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        for (int i = 0; i < cevaplar.length; i++) {
            int dogru = dogruSayisi(cevaplar[i], anahtar);
            System.out.println((i+1) + " nolu ogrencinin " + dogru + " dogru cevabi var.");
        }
    }
}

