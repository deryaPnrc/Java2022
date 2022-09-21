public class Main {
    public static void main(String[] args) {

            int number=-2;

            int remainder = number%2;
            //System.out.println(remainder);
            boolean asalMi=true;

            if (number==1){
                System.out.println("sayı asal değildir");
                return;
            }

            if (number<1){
                System.out.println("geçersiz sayı");
                return;
            }

            for (int i=2; i<number; i++){
                if (number % i == 0){
                    asalMi=false;
                }
            }
            if (asalMi==true){ // if (asalmi) aynı anlama gelmektedir
                System.out.println("sayı asaldır");
            }else {
                System.out.println("sayı asal değildir.");
            }
    }
}