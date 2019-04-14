/**
 * Given a string and an int n, return a string made of n repetitions of
 * the last n characters of the string. You may assume that n is between
 * 0 and the length of the string, inclusive
 */
public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        str = str.substring(str.length()-n);
        String result = "";

        for(int i = n; i > 0; i--) {
            result += str;
        }

        return result;
    }
}