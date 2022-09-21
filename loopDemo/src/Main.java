public class Main {
    public static void main(String[] args) {

        //FOR
       for (int i=2; i<=100; i+=2)
       {
           System.out.println(i);
       }
       System.out.println("for döngüsü bitti");


       //WHILE
        int i=1;
        while (i<10){

            System.out.println(i);
            i++;
        }
        System.out.println("while döngüsü bitti");

        //DO WHILE
        int j=1;
        do {
            System.out.println(j);
            j+=2;
        } while (j<10);
        System.out.println("do while döngüsü bitti");





    }
}