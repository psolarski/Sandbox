package HammingDistance;

public class Solution {

    private static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {
        int x = 1123, y = 3535;

        System.out.println(hammingDistance(x, y));
    }
}
