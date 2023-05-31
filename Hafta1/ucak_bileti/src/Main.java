import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mesafe, yas, tip;
        double fiyat;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mesafe (KM):");
        mesafe = scanner.nextInt();

        System.out.println("Yaşınız:");
        yas = scanner.nextInt();

        System.out.println("Yolculuk tipi (1: Tek Yön, 2: Gidiş-Dönüş):");
        tip = scanner.nextInt();

        if(yas>0 && mesafe>0 && (tip == 1 || tip == 2)){
            fiyat = mesafe * 0.10;


            // Yaş indirimini uygula
            if (yas < 12) {
                fiyat *= 0.5; // %50 indirim
            } else if (yas <= 24) {
                fiyat *= 0.9; // %10 indirim
            } else if (yas >= 65) {
                fiyat *= 0.7; // %30 indirim
            }

            // Yolculuk tipine göre indirim uygula
            if (tip == 2) {
                fiyat *= 0.8 * 2; // %20 indirim
            }
            System.out.println("Toplam Tutar: " + fiyat + " TL");

        }else
            System.out.println("Hatalı Veri Girdiniz!");


    }
}