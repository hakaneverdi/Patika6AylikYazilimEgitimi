import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("N1 sayısı:");
        int num1 = input.nextInt();

        System.out.print("N2 sayısı:");
        int num2 = input.nextInt();

        int originalNum1 = num1;
        int originalNum2 = num2;

        //EBOB

        while(num1 != num2) {
            if(num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        int ebob = num1;
        System.out.println("Ebob:" + ebob);

        // EKOK
        int ekok = (originalNum1 * originalNum2) / ebob;
        System.out.println("EKOK: " + ekok);








    }
}