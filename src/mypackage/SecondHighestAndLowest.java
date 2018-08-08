package mypackage;

public class SecondHighestAndLowest {

    public void comparePrice(double price1, double price2, double price3, double price4, double price5) {

        /*double price1;
        double price2;
        double price3;
        double price4;
        double price5;*/

        double high = price1;
        double low = price1;

        if (high < price2){
            high = price2;
        }
        if (high < price3){
            high = price3;
        }
        if (high < price4){
            high = price4;
        }
        if (high < price5){
            System.out.println("The second highest price is: " +  high);
        }else
            System.out.println("The second highest price is@: " + price5);

        if (low > price2){
            low = price2;
        }
        if (low > price3){
            low = price3;
        }
        if (low > price4){
            low = price4;
        }
        if (low > price5){
            System.out.println("The second lowest price is: " + low);
        }else
            System.out.println("The second lowest price is: " + price5);


        //highest and lowest prices:

        /*System.out.println(high);
        System.out.println(low);*/

    }
}
