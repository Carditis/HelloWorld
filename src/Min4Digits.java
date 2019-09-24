import java.util.Scanner;

public class Min4Digits {
    public static void main(String[] args) {
        Scanner hehe = new Scanner(System.in);
        int n = hehe.nextInt();
        System.out.print(min4Digits(n));

    }
    private static String min4Digits(int n) {
        String number = Integer.toString(n);
        String ret;

        if (number.length() == 1) {
            ret = "000";
        } else if (number.length() == 2) {
            ret = "00";
        } else if (number.length() == 3) {
            ret = "0";    
        } else {
            ret = "";
        }
     return ret + number;
    }
}