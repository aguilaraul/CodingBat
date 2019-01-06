/*
 * Given a non-empty string and an int n, return a new string where the char
 * at index n has been removed. The value of n will be a valid index of a
 * char in the original string(i.e. n will be in the range 0..str.length()-1
 * inclusive
 */
public class MissingChar {
	public static void main(String[] agrs) {
		System.out.println(missingChar("kitten", 1)); //"ktten"
		System.out.println(missingChar("kitten", 0)); //"itten"
		System.out.println(missingChar("kitten", 4)); //"kittn"
		System.out.println(missingChar("Hi", 0)); //"i"
		System.out.println(missingChar("Hi", 1)); //"H"
		System.out.println(missingChar("code", 0)); //"ode"
		System.out.println(missingChar("code", 1)); //"cde"
		System.out.println(missingChar("code", 2)); //"coe"
		System.out.println(missingChar("code", 3)); //"cod"
		System.out.println(missingChar("chocolate", 8)); //"chocolat"
	}

	public static String missingChar(String str, int n) {
		String first = str.substring(0,n);
		String second = str.substring(n+1,str.length());
		return first+second;
	}
}
