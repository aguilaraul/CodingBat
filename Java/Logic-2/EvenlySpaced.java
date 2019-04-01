/*
 * Given three ints, a b c, one of them is small, one is medium
 * and one is large. Return true if the three values are evenly
 * spaced, so the difference between small and medium is the same
 * as the difference between medium and large.
 */
public class EvenlySpace {
    public boolean evenlySpaced(int a, int b, int c) {
        int small = a;
        int medium = b;
        int large = c;
        
        if(small > medium && small > large) {
          large = a;
          small = c;
          
          if(small > medium) {
            medium = c;
            small = b;
          }
        } else if (small > medium && small < large ) {
          medium = a;
          small = b;
        } else if (medium > small && medium > large) {
          large = b;
          medium = c;
          if(small > medium) {
            small = c;
            medium = a;
          }
        }
        
        
        return ( (medium - small) == (large - medium) );
      }
}
  