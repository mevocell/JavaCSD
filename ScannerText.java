import java.util.Scanner;

public class ScannerText {
    public static void main(String[] args) {
        getScannerText();
    }
    public static void getScannerText(){
        Scanner getScanner = new Scanner(System.in);
        System.out.println("Adınızı Giriniz.");
        String name= getScanner.nextLine();
        System.out.println("Soyadınızı Giriniz.");
        String surname=getScanner.nextLine();
        System.out.println("Adınız :"+name);
        System.out.println("Soyadınız :"+surname);
        System.out.println("Adı ve Soyadı :"+name+" "+surname);

    }
}
