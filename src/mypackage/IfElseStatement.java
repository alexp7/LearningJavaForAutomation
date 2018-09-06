package mypackage;

public class IfElseStatement {

    public static void highestNumber() {

        int a, b, c, highestResult;
        /*a = 18 * 76;
        b = 98 * 73;
        c = 87 * 65;*/
        a = 9;
        b = 99;
        c = 999;

        if (a != b && a != c && b != c) {

            if (a > b && a > c) {
                highestResult = a;
            } else if (a > b && a < c) {
                highestResult = c;
            } else {
                highestResult = b;
            }
        } else if (a == b) {
            if (a > c)
                highestResult = a;
            else
                highestResult = c;
        } else if (a == c) {
            if (a > b)
                highestResult = a;
            else
                highestResult = b;
        } else if (b == c) {
            if (b > a)
                highestResult = b;
            else
                highestResult = a;
        } else {
            highestResult = a;
        }

        System.out.println("The highest number is: " + highestResult);
    }
}
