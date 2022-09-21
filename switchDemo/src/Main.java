import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) {

        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("geçti");
                break;
            case 'B':
                System.out.println("iyi not");
                break;
            case 'C':
                System.out.println("fena değil");
                break;
            case 'F':
                System.out.println("kaldınız");
                break;
            default:
                System.out.println("GEÇERSİZ NOT GİRİLDİ");

        }
    }
}