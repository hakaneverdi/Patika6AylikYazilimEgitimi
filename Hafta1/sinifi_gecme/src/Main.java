/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
 */



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, dersSayisi = 0, toplam = 0;
        double ortalama ;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuz:");
        mat = inp.nextInt();
        if ( mat >= 0 && mat <= 100){
            toplam += mat;
            dersSayisi++;
        }


        System.out.println("Fizik notunuz:");
        fizik = inp.nextInt();
        if ( fizik >= 0 && fizik <= 100){
            toplam += fizik;
            dersSayisi++;
        }

        System.out.println("Turkce notunuz:");
        turkce = inp.nextInt();
        if ( turkce >= 0 && turkce <= 100){
            toplam += turkce;
            dersSayisi++;
        }

        System.out.println("Kimya notunuz:");
        kimya = inp.nextInt();
        if ( kimya >= 0 && kimya <= 100){
            toplam += kimya;
            dersSayisi++;
        }

        System.out.println("Müzik notunuz:");
        muzik = inp.nextInt();
        if ( muzik >= 0 && muzik <= 100){
            toplam += muzik;
            dersSayisi++;
        }

        ortalama = toplam / dersSayisi;


        if (ortalama <= 55){
            System.out.println("Başarısız.");
        }else {
            System.out.println("Tebrikler! Sınıfı geçtiniz.");
        }

        System.out.println("Ortalamanız : " + ortalama);


    }
}