package mypackage;

/*
The solution of exercise 4
*/

public class SecondHighestAndSecondLowest {

    public void comparePrice () {

        int price1, price2, price3, price4, price5;
        price1 = 12;
        price2 = 8;
        price3 = 90;
        price4 = 100;
        price5 = 9;

        int low = price1;
        int high = price1;

        if (price1 < low){
            low = price1;
        }
        if (price1 > high){
            high = price1;
        }
        if (price2 < low){
            low = price2;
        }
        if (price2 > high){
            high = price2;
        }
        if (price3 < low){
            low = price3;
        }
        if (price3 > high){
            high = price3;
        }
        if (price4 < low){
            low = price4;
        }
        if (price4 > high){
            high = price4;
        }
        if (price5 < low){
            low = price5;
        }
        if (price5 > high){
            high = price5;
        }
        System.out.println("The highest price is: " + high);
        System.out.println("The lowest price is: " + low);

        int secondHigh = 0;
        int secondLow = high;

        if (price1 > secondHigh && price1 != high){
            secondHigh = price1;
        }
        if (price1 < secondLow && price1 != low){
            secondLow = price1;
        }
        if (price2 > secondHigh && price2 != high){
            secondHigh = price2;
        }
        if (price2 < secondLow && price2 != low){
            secondLow = price2;
        }
        if (price3 > secondHigh && price3 != high){
            secondHigh = price3;
        }
        if (price3 < secondLow && price3 != low){
            secondLow = price3;
        }
        if (price4 > secondHigh && price4 != high){
            secondHigh = price4;
        }
        if (price4 < secondLow && price4 != low){
            secondLow = price4;
        }
        if (price5 > secondHigh && price5 != high){
            secondHigh = price5;
        }
        if (price5 < secondLow && price5 != low){
            secondLow = price5;
        }
        System.out.println("The second high price is: " + secondHigh);
        System.out.printf("The second low price is: " + secondLow);
    }

}
