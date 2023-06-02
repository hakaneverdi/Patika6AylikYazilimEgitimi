/*
Java döngüler ile tek sayı girilene kadar
kullanıcıdan girişleri kabul eden ve girilen
değerlerden çift ve 4'ün katları olan sayıları toplayıp
ekrana basan programı yazıyoruz.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi;
        int toplam = 0;

        do{
            System.out.println("Bir sayi giriniz:");
            sayi = inp.nextInt();

            if(sayi % 4 == 0)
                toplam += sayi;

        } while(sayi % 2 != 1);

        System.out.println("Toplam:" + toplam);
    }
}