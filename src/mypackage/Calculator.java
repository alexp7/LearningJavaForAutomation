package mypackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public void calculations () throws InputMismatchException, ArithmeticException {

        System.out.println("Enter the first number (A): ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Enter the second number (B): ");
        int b = in.nextInt();

        System.out.println("Addition: (A+B) = " +  (a + b));
        System.out.println("Subtraction: (A-B) = " + (a-b));
        System.out.println("Multiplication: (A*B) =  " + (a * b));
        System.out.println("Division: (A/B) = " + (a / b));
        System.out.println("Modulus: (A%B) = " + (a % b));
        System.out.println("Increment: (A++) = " + a++);
        System.out.println("Value of A = " + a);
        System.out.println("Increment: (++A) = " + ++a);
        System.out.println("Decrement: (A--) = " + a--);
        System.out.println("Value of A = " + a);
        System.out.println("Decrement: (--A) = " + --a);
    }

}
