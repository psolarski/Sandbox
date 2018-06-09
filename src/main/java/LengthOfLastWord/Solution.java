package LengthOfLastWord;

public class Solution {

    private static int lengthOfLastWord(String s) {
        if(s.trim().isEmpty()) {
            return 0;
        }
        String[] parts = s.split(" ");
        return parts[parts.length-1].length();
    }

    public static void main(String[] args) {
        String words = "Hello World";
        System.out.println(lengthOfLastWord(words));
    }
}
