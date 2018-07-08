package LeetCode.TransposeMatrix;

public class Solution {

    private static int[][] transpose(int[][] A) {
        int[][] transposalMatrix = new int[A[0].length][A.length];

        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++) {
                transposalMatrix[j][i] = A[i][j];
            }
        }
        return transposalMatrix;
    }

    public static void main(String args[]) {
        int [][] beforeTransposal =  {{1,2,3}, {4,5,6}};

        for (int[] aBeforeTransposal : beforeTransposal) {
            for (int anABeforeTransposal : aBeforeTransposal) {
                System.out.print(anABeforeTransposal + " ");
            }
            System.out.println();
        }

        int [][] afterTransposal = transpose(beforeTransposal);

        for (int[] anAfterTransposal : afterTransposal) {
            for (int anAnAfterTransposal : anAfterTransposal) {
                System.out.print(anAnAfterTransposal + " ");
            }
            System.out.println();
        }
    }
}
