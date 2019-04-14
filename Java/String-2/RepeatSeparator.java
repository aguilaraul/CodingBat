/**
 * Given two strings, word and a separator sep, return a big string made
 * of count occurrences of the word, separated by the separator string
 */
public class RepeatSeparator {
    public String repeatSeparator() {
        String result = "";
        if(count == 1) return word;
  
        for(int i = count; i > 0; i--) {
            result += word;
            if(i > 1) {
            result += sep;
            }
        }
  
  
        return result;
    }
}