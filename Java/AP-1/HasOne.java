/*
 * Given a positive int n, return true if it contains a 1 digit.
 */
public class HasOne {
    public boolean hasOne(int n) {
        int count = 0;
        count = countOnes(n, count);
        if(count > 0) {
          return true;
        } 
        return false;
      }
      
      public int countOnes(int n, int count) {
        if(n == 0) {
          return count;
        } else if(n % 10 == 1) {
          count++;
          return countOnes(n/10, count);
        } else {
          return countOnes(n/10, count);
        }
      }
}