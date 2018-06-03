package MorseCodeWords;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    private static int uniqueMorseRepresentations(String[] words) {

        String[] strd = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> result = new HashSet<>();

        for (String word : words) {
            String output = "";
            for (int i = 0; i < word.length(); i++) {
                output += strd[(int) word.charAt(i) - 97];
            }
            result.add(output);
        }

        return result.size();
    }

    public static void main(String[] args) {

        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println("Number of unique morse code words: " + uniqueMorseRepresentations(words));
    }
}