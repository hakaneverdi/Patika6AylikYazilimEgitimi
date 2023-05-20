import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Manav Kasa Programı
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
        toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
         */

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, tutar;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç kg armut? : ");
        armut *= inp.nextDouble();

        System.out.print("Kaç kg elma? : ");
        elma *= inp.nextDouble();

        System.out.print("Kaç kg domates? : ");
        domates *= inp.nextDouble();

        System.out.print("Kaç kg muz?:" );
        muz *= inp.nextDouble();

        System.out.print("Kaç kg patlıcan? : ");
        patlican *= inp.nextDouble();

        tutar = armut + elma + domates + muz + patlican;
        System.out.println("Tutar = " + tutar + " TL");






    }
}