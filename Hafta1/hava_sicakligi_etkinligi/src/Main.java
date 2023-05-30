/*
Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int sicaklik;
        Scanner inp = new Scanner(System.in);

        System.out.println("Hava sıcaklığı:");
        sicaklik = inp.nextInt();
        
        if (sicaklik<=5){
            System.out.print("Kayak yapabilirsiniz.");
        } else if (sicaklik<10) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (sicaklik>=10 && sicaklik<=15) {
            System.out.println("Sinemaya ya da pikniğe gidebilirsiniz.");
        } else if (sicaklik>15 && sicaklik<=25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        }else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}