import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c, cevre;
        double  u, alan;

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. kenar uzunluğu:");
        a = scanner.nextInt();
        System.out.print("2. kenar uzunluğu:");
        b = scanner.nextInt();
        System.out.print("3. kenar uzunluğu:");
        c = scanner.nextInt();

        cevre = a+b+c;
        u = cevre/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print("Üçgenin alanı: " + alan);

    }
}