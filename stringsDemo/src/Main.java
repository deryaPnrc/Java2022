import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String mesaj = "     Bugün hava çok güzel.       ";
        System.out.println(mesaj);
/*
        System.out.println("eleman sayısı : " + mesaj.length());

        System.out.println("5. eleman " + mesaj.charAt(4)); // karakterlere charAt ile ulaşırız.

        System.out.println(mesaj.concat("Yaşasın!")); // iki stringi birleştirir --> .concat

        System.out.println(mesaj.startsWith("B")); // ne ile başlıyor

        System.out.println(mesaj.endsWith(".")); // ne ile bitiyor

        char [] karakterler= new char[5];

        mesaj.getChars(0,5,karakterler,0);

        System.out.println(karakterler);

        System.out.println(mesaj.indexOf('a'));// içinde kaçıncı harf olduğunu söyler

        System.out.println(mesaj.lastIndexOf("a")); // aramaya sağdan başlar sayısını soldan verir
*/
        String yeniMesaj = mesaj.replace(' ','-'); // karakterleri değiştirir
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,4)); //2den itibaren yazar

        for (String kelime: mesaj.split(" ")){ // kelimeleri tek tek yazdırır.
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); // harfleri küçük yazar.
        System.out.println(mesaj.toUpperCase()); // harfleri büyük yazar.
        System.out.println(mesaj.trim()); // boşluk siiler.


    }
}