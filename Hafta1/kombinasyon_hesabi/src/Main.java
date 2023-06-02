/*
Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("n değerini girin: ");
        int n = scanner.nextInt();

        System.out.print("r değerini girin: ");
        int r = scanner.nextInt();

        int faktoriyelN = 1;
        for (int i = 1; i <= n; i++) {
            faktoriyelN *= i;
        }

        int faktoriyelR = 1;
        for (int i = 1; i <= r; i++) {
            faktoriyelR *= i;
        }

        int faktoriyelNR = 1;
        for (int i = 1; i <= (n - r); i++) {
            faktoriyelNR *= i;
        }

        int kombinasyon = faktoriyelN / (faktoriyelR * faktoriyelNR);

        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
    }
    
}