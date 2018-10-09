package mypackage;

public class SwitchStatement {

    public static void divisibleByTen() {

        int a = 80;

        if (a >= 0 && a <= 100) {

            switch (a) {
                case 10:
                    System.out.println("a = " + a + " and it is divisible by 10");
                    break;
                case 20:
                    System.out.println("a = " + a + " and it is divisible by 10");
                    break;
                case 30:
                    System.out.println("a = " + a + " and it is divisible by 10");
                    break;
                case 40:
                    System.out.println("a = " + a + " and it is divisible by 10");
                    break;
                case 50:
                    System.out.println("a = " + a + " and it is divisible by 10");
                    break;
                case 60:
                    System.out.println("a = " + a + " and it is divisible by 10");
                    break;
                case 70:
                    System.out.println("a = " + a + " and it is divisible by 10");
                    break;
                case 80:
                    System.out.println("a = " + a + " and it is divisible by 10");
                    break;
                case 90:
                    System.out.println("a = " + a + " and it is divisible by 10");
                    break;
                case 100:
                    System.out.println("a = " + a + " and it is divisible by 10");
                    break;
                default:
                    System.out.println("a is not divisible by 10");
            }
        } else
            System.out.println("Enter a number between 0 and 100");
    }
}
