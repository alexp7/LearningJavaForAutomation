package mypackage;

import java.util.Scanner;

public class SimpleCalculator {

    public static void calculator() {

        int a, b;
        double resultOfDivision;
        String action;

        System.out.println("Enter the first number");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();

        System.out.println("Enter the second number");
        b = r.nextInt();

        System.out.println("Enter the operator");
        Scanner op = new Scanner(System.in);
        action = op.nextLine();

        if (b == 0 && action.equals("/")) {
            System.out.println("You can not divide by zero");
        } else {
            switch (action) {
                case "+":
                    System.out.println("The result is: " + (a + b));
                    break;
                case "-":
                    System.out.println("The result is: " + (a - b));
                    break;
                case "*":
                    System.out.println("The result is: " + (a * b));
                    break;
                case "/":
                    resultOfDivision =  ((double )a / b);
                    System.out.println("The result is: " + resultOfDivision);
                    break;
                default:
                    System.out.println("The operator should be +, - , * or / ");
            }
        }
    }
}
