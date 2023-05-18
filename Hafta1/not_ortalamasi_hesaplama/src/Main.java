import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //degiskenler olusturuluyor
        int mat, fizik, kimya, turkce, tarih, muzik;

        //scanner sinifi tanimlaniyor
        Scanner inp = new Scanner(System.in);

        //kullanicidan değerler aliniyor

        System.out.println("Matematik notunuz:");
        mat = inp.nextInt();

        System.out.println("Fizik notunuz:");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuz:");
        kimya = inp.nextInt();

        System.out.println("Turkce notunuz");
        turkce = inp.nextInt();

        System.out.println("Tarih notunuz");
        tarih = inp.nextInt();

        System.out.println("Muzik notunuz");
        muzik = inp.nextInt();

        double ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.println("Ortalamanız:" + ortalama);

        //odev

        String sonuc = (ortalama >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);



    }
}