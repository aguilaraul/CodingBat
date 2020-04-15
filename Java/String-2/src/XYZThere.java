/**
 * Return true if the given string contains an appearance of "xyz" where
 * the xyz is not directly preceeded by a period (.). So "xxyz" counts
 * but "x.xyz" does not
 */
public class XYZThere {
    public static boolean xyzThere(String str) {
        if(!str.contains("xyz")) {
            return false;
        }

        int period = str.indexOf('.');
        if(period >= 0) {
            String test = str.substring(period+1, period+4);
            return !test.equals("xyz");
        } 

        return true;
    }
}