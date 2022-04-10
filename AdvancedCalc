import java.util.Scanner;

public class Main {

    static int sum(int n1 , int n2){
        int result = n1 + n2;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus (int n1, int n2){
        int result = n1 - n2;
        System.out.println("Cikarma : " + result);
        return result;
    }

    static int multip (int n1, int n2){
        if (n1 == 0 && n2 == 0){
            System.out.println("Sayilardan ikiside sifira esit olamaz... ");
            return 0;
        }
        int result = n1 * n2;
        System.out.println("Carpma : " + result);
        return result;
    }

    static int division(int n1, int n2){
        if ( n2 == 0){
            System.out.println("Sayinin sifira bolumu tanimsizdir...");
            return 0;
        }


        int result = n1/n2;
        System.out.println("Bolme : " + result);
        return result;
    }

    static int top (int n1, int n2){
        int result = 1;
        for (int i=1; i<=n2; i++){
            result = result * n1;
        }
        System.out.println("Ust islemi  : " + result);
        return result;
    }

    static int mod (int n1, int n2){
        int result = n1 % n2;
        System.out.println("Mod  : " + result);
        return result;
    }

    static void calc (int n1, int n2){
        System.out.println("Cevresi : " + (2 * (n1 + n2)));
        System.out.println("Alani  : " + (n1 * n2));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int select = 0;


        String menu = "1- Toplama Islemi \n"
                + "2- Cikarma Islemi \n"
                + "3- Carpma Islemi \n"
                + "4- Bolme Islemi \n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Mod alma \n"
                + "7- Dikdortgen Alan ve Cevre Hesabi\n"
                + "0- Cikis Yap";

        while (true){
            System.out.println(menu);
            System.out.print("Bir islem seciniz : ");
            select = input.nextInt();
            if (select == 0){
                break;
            }
            System.out.print("Birinci sayiyi giriniz : ");
            int n1 = input.nextInt();
            System.out.print("ikinci sayiyi giriniz :");
            int n2 = input.nextInt();
            switch (select){
                case 1:
                    sum(n1,n2);
                    break;
                case 2:
                    minus(n1,n2);
                    break;
                case 3:
                    multip(n1,n2);
                    break;
                case 4:
                    division(n1,n2);
                    break;
                case 5:
                    top(n1,n2);
                    break;
                case 6:
                    mod(n1,n2);
                    break;
                case 7 :
                    calc(n1,n2);
                    break;
                default:
                        System.out.println("Gecersiz bir islem girdiniz : ");

            }


        }
        System.out.println("Gule gule ");

    }

}
