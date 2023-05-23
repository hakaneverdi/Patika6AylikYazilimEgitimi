import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2;
        char islem;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayı:");
        n1 = scanner.nextInt();
        System.out.println("İkinci sayı:");
        n2 = scanner.nextInt();
        System.out.println("İşlemi seçiniz (+ * / -)");
        islem = scanner.next().charAt(0);

        switch(islem) {
            case '+' :
                System.out.println("Sonuç: " + (n1+n2));
                break;
            case '-':
                System.out.println("Sonuç: " + (n1-n2));
                break;
            case '*':
                System.out.println("Sonuç: " + (n1*n2));
                break;
            case '/':
                if (n2 == 0)
                    System.out.println("0'a bölemezsiniz");
                else
                    System.out.println("Sonuç: " + (n1/n2));
                break;
            default:
                System.out.println(("Yanlış bir değer girdiniz."));

        }
    }
}