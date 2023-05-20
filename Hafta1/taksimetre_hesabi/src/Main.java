import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Taksimetre Programı

    Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
    Taksimetre KM başına 2.20 TL tutmaktadır.
    Minimum ödenecek tutar 20 TL'dir. 20 TL altındaki ücretlerde yine 20 TL alınacaktır.
    Taksimetre açılış ücreti 10 TL'dir.
         */

        int km ;
        double perKm = 2.20, total, startPrice = 10;

        Scanner inp = new Scanner(System.in);
        System.out.print("Gidilecek mesafe (km) :");
        km = inp.nextInt();

        total = ( km * perKm);
        total += startPrice;

        total = (total < 20) ? 20 : total;

        System.out.print("Toplam tutar:" + total);










    }
}