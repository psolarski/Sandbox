package JudgeRouteCircle;

public class Solution {

    private static boolean judgeCircle(String moves) {
        int U = 0, D = 0, L = 0, R = 0;
        for(int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U': U++; break;
                case 'R': R++; break;
                case 'L': L++; break;
                case 'D': D++; break;
            }
        }
        return (U == D && L == R);
    }

    public static void main(String[] args) {
        String moves = "ULDDR";
        System.out.println("Is same position after moves? " + judgeCircle(moves));
    }
}
