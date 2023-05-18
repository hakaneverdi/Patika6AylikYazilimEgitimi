import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kdvsiz, kdvorani, kdvtutari, kdvlitutar;

        System.out.print("Ürünün fiyatı:");
        Scanner scanner = new Scanner(System.in);
        kdvsiz = scanner.nextDouble();

        kdvorani = kdvsiz < 1000 ?  0.18 :  0.08;
        kdvtutari = kdvsiz * kdvorani;
        kdvlitutar = kdvsiz + kdvtutari;

        System.out.println("Kdvsiz tutar:" + kdvsiz);
        System.out.println("KDV orani:" + kdvorani);
        System.out.println("Kdv tutari:" + kdvtutari);
        System.out.println("Kdvli tutar: " + kdvlitutar);

    }
}