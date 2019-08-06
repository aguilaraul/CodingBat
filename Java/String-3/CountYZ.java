/**
 * Given a string, count the number of words ending in 'y' or 'z' -- 
 * so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y'
 * in "yellow" (not case sensitive). We'll say that a y or z is at the
 * end of a word if there is not an alphabetic letter immediately following it.
 */
public class CountYZ {
    public int countYZ(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(!Character.isLetter(str.charAt(i)) && i > 0) {
                if(str.substring(i-1,i).equalsIgnoreCase("y") || str.substring(i-1,i).equalsIgnoreCase("z")) {
                    count++;
                }
            } else if(i == str.length()-1) {
                if(str.substring(i).equalsIgnoreCase("y") || str.substring(i).equalsIgnoreCase("z")) {
                    count++;
                }
            }
        }

        return count;
    }
}