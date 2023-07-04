import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısı: ");

        int basamak = scanner.nextInt();

        for (int i = 0; i < basamak; i++){

            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * (basamak - i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}