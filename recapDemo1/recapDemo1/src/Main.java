public class Main {
    public static void main(String[] args) {

        int sayi1=3;
        int sayi2=50;
        int sayi3=5;
        int enBuyuk=sayi1;

        if (enBuyuk<sayi2){
            enBuyuk=sayi2;
        }
        if(enBuyuk<sayi3){
            enBuyuk=sayi3;
        }
        System.out.println("En büyük sayı = "+enBuyuk);
    }
}