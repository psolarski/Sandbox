package LeetCode.FlippingImage;

public class Solution {

    private static int[][] flipAndInvertImage(int[][] A) {
        int[][] newtable = new int[A.length][];
        for (int i = 0; i < A.length; i++) {
            newtable[i] = new int[A[i].length];
            for (int j = 0; j < A[i].length; j++) {

                if (A[i][j] == 1) A[i][j] = 0;
                else A[i][j] = 1;
            }
            for (int j = 0; j < A[i].length; j++) {
                newtable[i][j] = A[i][A[i].length - j - 1];
            }
        }
        return newtable;
    }
}
