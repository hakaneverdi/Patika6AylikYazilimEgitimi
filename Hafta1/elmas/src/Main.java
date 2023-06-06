/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

n = 5
 */

//üst üçgen için




import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Elmasın yüksekliğini giriniz:");
        int n = inp.nextInt();

        //elmasın üstü
        for (int i = 1; i <= n ; i++){

            for (int k = 1 ; k <= n-i; k++){
                System.out.print(" ");
            }

            for (int j = 1 ; j <= (2*i) - 1 ; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        //elmasın altı
        for (int i = n-1; i >= 1 ; i--){

            for (int k = 1 ; k <= n-i; k++){
                System.out.print(" ");
            }

            for (int j = 1 ; j <= (2*i) - 1 ; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}