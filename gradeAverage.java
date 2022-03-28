/*Grade Average

Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav
puanlarını kullanıcıdan klavey ile alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
Not : If ve Else kullanılmayacak...*/

import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int mat,fzk,kimya,turk,tarih,muzik;
        System.out.println("Matematik notunuzu giriniz :");
        mat=scan.nextInt();

        System.out.println("Fizik notunuzu giriniz :");
        fzk=scan.nextInt();

        System.out.println("Kimya notunuzu giriniz :");
        kimya=scan.nextInt();

        System.out.println("Türkçe notunuzu giriniz :");
        turk=scan.nextInt();

        System.out.println("Tarih notunuzu girininiz :");
        tarih=scan.nextInt();

        System.out.println("Müzik notunuzu girinini z:");
        muzik=scan.nextInt();

        int sum = (mat+fzk+kimya+turk+tarih+muzik);
        double average = sum/6.0;
        System.out.println("ORTALAMANIZ :" + sum);

        String score = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı.";
        System.out.println(score);



    }
}
