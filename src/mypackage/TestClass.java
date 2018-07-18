package mypackage;

import java.util.InputMismatchException;

public class TestClass {
    public static void main(String[] args) {

        /*byte varByte  = 1;
        short varShort  = -456;
        int varInt = 45678;
        long varLong = 1234567891;
        float varFloat = 5.9f;
        double varDouble = -1999.745254;
        char varChar = 'J';
        boolean varBoolean = true;
        String str = "Hi All!!!";

        PrintAllVariables printAllVariables = new PrintAllVariables();

        printAllVariables.PrintByte(varByte);
        printAllVariables.PrintShort(varShort);
        printAllVariables.PrintInt(varInt);
        printAllVariables.PrintLong(varLong);
        printAllVariables.PrintFloat(varFloat);
        printAllVariables.PrintDouble(varDouble);
        printAllVariables.PrintChar(varChar);
        printAllVariables.PrintBoolean(varBoolean);
        printAllVariables.PrintString(str);
        */

        // Exercise #2
        Calculator calculator = new Calculator();
        try {
            calculator.calculations();
        } catch (InputMismatchException e){
            System.out.println("Only integer allowed!!!");
        } catch (ArithmeticException e){
            System.out.println("Can't divide by zero!!!");
        }
    }
}