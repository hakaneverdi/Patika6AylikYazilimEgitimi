/* Ödev
        Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

        Örnek : 1643 = 1 + 6 + 4 + 3 = 14

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Bir sayı girin:");
        int number = inp.nextInt();

        int sum = 0;

        while(number != 0){
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("Sayının basamakları toplamı: " + sum);
    }
}