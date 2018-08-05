package LeetCode.NumberComplement;

import java.util.Stack;

public class Solution {

    public static void main(String args[]) {
        int num = 25;
        System.out.println(findComplement(num));
    }

    private static int findComplement(int num) {
        Stack<Integer> integerStack = new Stack<>();
        while (num != 0) {
            integerStack.push(num%2);
            num = num/2;
        }

        int[] bits = new int[integerStack.size()];

        for(int i = 0; 0 < integerStack.size(); i++) {
            bits[i] = integerStack.pop();
        }

        int output = 0;
        int bit = 0;
        for (int i = 0; i < bits.length; i++) {
            bit = bits[i];
            if(bit == 1) {
                bit = 0;
            } else if (bit == 0) {
                bit = 1;
            }
            output += (int) (bit * Math.pow(2, bits.length-i-1));
        }
        return output;
    }
}
