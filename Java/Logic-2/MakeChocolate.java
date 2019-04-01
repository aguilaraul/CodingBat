/*
 * We want make a package of goal kilos of chocolate. We have
 * small bars (1 kilo each) and big bars (5 kilos each). Return
 * the number of small bars to use, assuming we always use big
 * bars before small bars. Return -1 if it can't be done. 
 */
public class MakeChocolate { 
  public static void main(String[] args) {
    System.out.println(makeChocolate(5, 4, 9));    
  }
  
  public static int makeChocolate(int small, int big, int goal) {
    int bigCount = big;
    big = 5;
        
    for(int i = bigCount; i > 0; i--) {
      if(!(goal - big < 0)) {
        goal -= big;
      }
    }
    
    if(goal - small == 0) {
      return small;
    }
    if(goal < small) {
      return goal;
    }
    
    return -1;
  }
}