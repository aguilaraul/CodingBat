/**
 * Given an array of strings, return a new array without the strings that are equal
 * to the target string. One approach is to count the occurrences of the target string,
 * make a new array of the correct length, and then copy over the correct strings.
 */

public class WordsWithout {
    public static String[] wordsWithout(String[] words, String target) {
        int count = 0;

        for(String s : words) {
            if(!s.equals(target)) {
                count++;
            }
        }

        String[] wordsWithout = new String[count];

        int i = 0;
        for(String s : words) {
            if(!s.equals(target)) {
                wordsWithout[i] = s;
                i++;
            }
        }
        

        return wordsWithout;
    }
}