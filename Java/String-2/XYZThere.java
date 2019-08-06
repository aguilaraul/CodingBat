/**
 * Return true if the given string contains an appearance of "xyz" where
 * the xyz is not directly preceeded by a period (.). So "xxyz" counts
 * but "x.xyz" does not
 */
public class XYZThere {

    public static void main(String[] args) {
        String[] str = {"abcxyz", "abc.xyz", "xyz.abc", "abcxy", "abc.xyzxyz", ".xyz"};

        for(String s:str) {
            System.out.println(xyzThere(s));
        }
    }

    public static boolean xyzThere(String str) {
        if(!str.contains("xyz")) {
            return false;
        }

        for(int i = 0; i < str.length()-3; i++) {
            if(str.substring(i, i+3).contains("xyz")) {
                if(str.charAt(i-1) == '.' && i >= 1) {
                    return false;
                }
            }
        }

        return true;
    }
}