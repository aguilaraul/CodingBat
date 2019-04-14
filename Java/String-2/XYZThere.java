/**
 * Return true if the given string contains an appearance of "xyz" where
 * the xyz is not directly preceeded by a period (.). So "xxyz" counts
 * but "x.xyz" does not
 */
public class XYZThere {
    public boolean xyzThere(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '.') {
                if(str.substring(i, i+4).contains("xyz")) {
                    return true;
                }
            }
        }

        return false;
    }
}