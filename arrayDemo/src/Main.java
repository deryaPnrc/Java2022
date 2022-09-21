public class Main {
    public static void main(String[] args) {

        String ogrenci1 = "derya";
        String ogrenci2 = "derin";
        String ogrenci3 = "deniz";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("<----------------------------------------------------->");

        String[] ogrenciler = new String[4];

        ogrenciler[0] = "a kişisi";
        ogrenciler[1] = "b kişisi";
        ogrenciler[2] = "c kişisi";
        ogrenciler[3] = "d kişisi";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("<----------------------------------------------------->");
        for (String ogrenci : ogrenciler){
            System.out.println(ogrenci);
        }


    }
}