/*
Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan
sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını
hesaplayan programı yazınız.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz:");
        int k = scanner.nextInt();

        int toplam = 0;
        int sayac = 0;

        for (int i = 1; i <= k; i++ ){
            if((i % 3 == 0) && (i % 4 == 0)){
                toplam += i;
                sayac++;
            }
        }
        if (sayac > 0) {
            double ortalama = (double) toplam / sayac;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("3 ve 4'e tam bölünen hiçbir sayı yok.");
        }
    }
}