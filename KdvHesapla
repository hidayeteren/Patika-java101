import java.util.Scanner;
public class project {
    public static void main(String[] args) {

        double tutar,kdvOran=0.18, kdvOran2=0.08, kdvTutar, kdvliTutar;

        Scanner inp = new Scanner (System.in);

        System.out.print("Urun Fiyatini Giriniz:");
        tutar=inp.nextDouble();

       double hesap= (tutar >1000) ? kdvOran2 : kdvOran;

        kdvTutar= tutar*hesap;
        kdvliTutar= tutar+kdvTutar;


System.out.println("KDVsiz Tutar :"+ tutar);
        System.out.println("KDV Orani:"+ hesap);

        System.out.println("KDV Tutari :"+ kdvTutar);

        System.out.println("KDVli Fiyat :"+ kdvliTutar);

    }
}
