package ReverseInteger;

public class Solution {

    private static int reverse(int x) {
        long reverseInt = 0;
        long input = x;
        while (input != 0) {
            reverseInt = reverseInt * 10 + input % 10;
            input = input / 10;
        }
        if(reverseInt > Integer.MAX_VALUE || reverseInt < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) reverseInt;
    }

    public static void main(String[] args) {
        int x = 43534;

        System.out.println("Reversed integer: " + reverse(x));
    }
}
