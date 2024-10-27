import java.util.Scanner;

public class ScannerDouble {
    public static void main(String[] args) {
        getScannerDouble();
    }

    public static void getScannerDouble() {
        Scanner getScanner= new Scanner(System.in);
        System.out.println("Birinci Sayıyı Giriniz.");
        double numberOne=getScanner.nextDouble();
        System.out.println("İkinci Sayıyı Giriniz.");
        double numberTwo=getScanner.nextDouble();
        System.out.println("Girilen Birinci Sayı: "+numberOne);
        System.out.println("İkinci Girilen Sayı :"+numberTwo);
        double sum=numberOne+numberTwo;
        System.out.println("Girilen Sayıların Toplamı :"+sum);
        double subtraction =numberOne-numberTwo;
        System.out.println("Girilen Sayıların Farkı :"+subtraction);
        double multiplication = numberOne*numberTwo;
        System.out.println("Girilen Sayıların Çarpımı :"+multiplication);
        double division=numberOne/numberTwo;
        System.out.println("Girilen Sayıların Bölümü :"+division);
    }
}
