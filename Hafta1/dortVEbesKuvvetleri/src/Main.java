/*
Ödev
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in
kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Bir sayı giriniz:");
        int n = inp.nextInt();

        int sayac = 0;

        for(int i = 1, k = 1; i < n && k < n; i *=4, k *=5){

            System.out.println("4'ün " + sayac + ".kuvveti: " + i);
            System.out.println("5'in " + sayac + ".kuvveti: " + k);
            sayac++;

        }
    }
}