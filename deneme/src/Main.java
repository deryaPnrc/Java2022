public class Main {
    public static void main(String[] args) {

        int sayi1=13;
        int sayi2=14;
        int sayi3=12;
        int enBuyuk=sayi1;

        if(enBuyuk>sayi2){
            enBuyuk=sayi2;
        }
        if(enBuyuk>sayi3){
            enBuyuk=sayi3;
        }
        else {
            System.out.println("SAYILAR EŞİTTİR");
        }
        System.out.println("EN BÜYÜK SAYI = "+enBuyuk);


    }
}