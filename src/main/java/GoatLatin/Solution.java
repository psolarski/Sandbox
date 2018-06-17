package GoatLatin;

public class Solution {

    private static String toGoatLatin(String sentence) {

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String sufix = "ma";
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            boolean firstLetterAsVowel = false;
            for (char vowel : vowels) {
                if (words[i].toLowerCase().indexOf(vowel) == 0) {
                    firstLetterAsVowel = true;
                }
            }
            if(firstLetterAsVowel) {
                sb.append(words[i]).append(sufix);
            } else {
                sb.append(words[i]);
                sb.append(words[i].charAt(0));
                sb.deleteCharAt(sb.length() - words[i].length() - 1);
                sb.append(sufix);
            }

            for(int j = 0; j < i + 1; j++) {
                sb.append("a");
            }
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumped over the lazy dog";

        System.out.println(toGoatLatin(sentence));
        System.out.println("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa");
    }
}
