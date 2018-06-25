package AddDigits;

public class Solution {

    private static int addDigits(int num) {
        return num - 9 * (int) Math.floor((num-1)/9);
    }

    public static void main(String[] args) {
        int num = 33341;
        System.out.println("Digital root of " + num + " is: " + addDigits(num));
    }
}
