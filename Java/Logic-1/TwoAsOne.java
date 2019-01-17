/*
 * Given three ints, a b c, return true if it possible to add
 * two of the three ints to get the third
 */
 public boolean twoAsOne(int a, int b, int c) {
	 if(a+b == c || a+c == b|| b+c == a) return true;
	 return false;
 }
