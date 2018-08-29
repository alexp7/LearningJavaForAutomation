package mypackage;

public class FirstAndLastCharInString {

    public static void firstAndLastChar(){

        String a = "hi_A";
        String b = "hey_B";
        String c = "hello_C";
        String d = "hows it going_D";
        String e = "whats up_E";

        String result = "" + a.charAt(0) + b.charAt(0) + c.charAt(0) + d.charAt(0) + e.charAt(0)
                + a.charAt(a.length()-1) + b.charAt(b.length()-1) + c.charAt(c.length()-1) + d.charAt(d.length()-1) + e.charAt(e.length()-1);

        System.out.println(result);
    }
}
