import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while(right > 0 ){
            System.out.println("Kullanıcı Adı:");
            userName = inp.nextLine();
            System.out.println("Şifre:");
            password = inp.nextLine();

            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba Kodluyoruz Bankasına hoş geldiniz.");
                do {


                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = inp.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Para miktarı : ");
                            int price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Para miktarı : ");
                            price = inp.nextInt();
                            balance -= price;
                            break;
                        case 3:
                            System.out.println("Bakiye :" + balance);
                            break;

                        default:
                            if (select !=4){
                                System.out.println("Hatalı tuşlama.");
                                break;}
                    }
                }while (select !=4);
                System.out.println("Tekrar görüşmek üzere.");
                break;

            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }

            }

        }
    }
}
