import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kdvsiz, kdv, kdvli;

        System.out.print("Ürünün fiyatı:");
        Scanner scanner = new Scanner(System.in);
        kdvsiz = scanner.nextDouble();

        kdv = kdvsiz * 0.18;
        kdvli = kdvsiz + kdv;

        System.out.println("Kdvsiz tutar:" + kdvsiz);
        System.out.println("Kdv tutari:" + kdv);
        System.out.println("Kdvli tutar: " + kdvli);

    }
}