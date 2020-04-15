/**
 * Given two strings, return true if either of the strings appear at
 * the very end of the other string, ignoring upper/lower case
 * differences
 */
public class EndOther {
    public boolean endOther(String a, String b) {
        String shorter = a.toLowerCase();
        String longer = b.toLowerCase();

        if(longer.length() < shorter.length()) {
            longer = a;
            shorter = b;
        }

        return longer.substring(longer.length() - shorter.length()).contains(shorter);
    }
}