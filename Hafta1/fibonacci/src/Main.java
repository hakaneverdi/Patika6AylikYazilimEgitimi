import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();

        System.out.println("Fibonacci Serisi:");
        int fib1 = 0, fib2 = 1;
        System.out.print(fib1 + " " + fib2 + " ");

        for (int i = 2; i < elemanSayisi; i++) {
            int fib3 = fib1 + fib2;
            System.out.print(fib3 + " ");
            fib1 = fib2;
            fib2 = fib3;
        }
    }
}