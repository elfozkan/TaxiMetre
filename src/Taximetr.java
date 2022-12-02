import java.util.Scanner;

public class Taximetr {
    public static void main(String[] args) {
        // Gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran program.
        // Taksimetre KM başına 2.20 TL tutmaktadır.
        // Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        // Taksimetre açılış ücreti 10 TL'dir.

        double km = 2.20 , mesafe ,toplam ,a;
        int minUcret=20 ,acilis=10 ;
        Scanner musteri = new Scanner(System.in); 
        System.out.print("Lütfen mesafeyi km cinsinden giriniz: ");
        mesafe = musteri.nextDouble();
        toplam = (mesafe*km);
        toplam +=acilis;
        a = (toplam>=20)? toplam : minUcret ;
        System.out.println("Ücretiniz: "+a);


    }



}
