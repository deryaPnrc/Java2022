public class Main {
    public static void main(String[] args) {
        double [] myList={1.2,1.3,5.2,0.4,7};
        double total=0;
        double enBuyuk=myList[0];

        for (double number:myList){
            if (enBuyuk<number){
                enBuyuk=number;
            }
            total=total+number;
            System.out.println(number);
        }
        System.out.println("toplam= "+total);
        System.out.println("en büyük sayı= "+enBuyuk);


    }
}