import java.util.Scanner;

public class HarmonikSerisi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt();

        double harmonicSeries = 0;
        for (int i = 1; i <= n; i++) {
            harmonicSeries += (double) 1 / i;
        }

        System.out.println("Harmonik Seri: " + harmonicSeries);
    }
}