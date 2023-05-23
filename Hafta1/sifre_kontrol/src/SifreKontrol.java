import java.util.Scanner;
/*
Ödev

Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak
isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip,
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
*/

public class SifreKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dogruSifre = "12345"; // Örnek doğru şifre

        System.out.print("Şifrenizi giriniz: ");
        String girilenSifre = scanner.nextLine();

        if (girilenSifre.equals(dogruSifre)) {
            System.out.print("Girilen şifre doğru. Programa hoş geldiniz!");
        } else {
            System.out.print("Girilen şifre yanlış. Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
            String cevap = scanner.nextLine();

            if (cevap.equalsIgnoreCase("evet")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                String yeniSifre = scanner.nextLine();

                if (yeniSifre.equals(girilenSifre) || yeniSifre.equals(dogruSifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                    dogruSifre = yeniSifre;
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }
    }
}
