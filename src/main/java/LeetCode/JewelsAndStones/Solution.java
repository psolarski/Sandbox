package LeetCode.JewelsAndStones;

public class Solution {

    private static int numJewelsInStones(String J, String S) {
        int c = 0;
        for (int i=0; i<J.length(); i++) {
            char cJ = J.charAt(i);
            for (int j=0; j<S.length(); j++) {
                if(cJ == S.charAt(j)) c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        String J = "aA", S = "aAAbbbb";
        System.out.println("Number of jewels: " + numJewelsInStones(J, S));

        String Jewel = "z", Stones = "ZZ";
        System.out.println("Number of jewels: " + numJewelsInStones(Jewel, Stones));
    }
}
