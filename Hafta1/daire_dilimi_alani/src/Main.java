import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanını bulan programı yazınız.
        𝜋 sayısını = 3.14 alınız.
        Formül : (𝜋 * (r*r) * 𝛼) / 360
         */

        int r, aci;
        double pi = 3.14, alan;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dairenin yarı çapı :");
        r = scanner.nextInt();

        System.out.print("Alanı istenilen merkez açı : ");
        aci = scanner.nextInt();

        alan = (pi * (r * r) * aci) / 360;
        System.out.print("Açının alan: " + alan);

    }
}