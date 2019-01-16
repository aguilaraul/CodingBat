/*
 * Given a non-negative number "num", return true if num is
 * within 2 of a multiple of 10.
 */
public boolean nearTen(int num) {
	if(num%10 <= 2 || Math.abs(num%10-10) <= 2) return true;
	return false;
}
