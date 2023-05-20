import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy, kilo, kitleEndeksi;

        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuz(kg): ");
        kilo = input.nextDouble();

        System.out.print("Boyunuz(m): ");
        boy = input.nextDouble();

        kitleEndeksi = kilo / (boy * boy);
        System.out.print("Vücut kitle endeksi:" + kitleEndeksi);

    }
}