/*
 * Given a string, return the count of the number of times that
 * a substring length 2 appears in the string and also the last
 * 2 chars of the string, so "hixxxhi" yields 1 (we won't count
 * the end substring).
 */
public class Last2 {
	public static void main(String[] args) {
		System.out.println(last2("hixxhi")); // 1
		System.out.println(last2("xaxxaxaxx")); // 1
		System.out.println(last2("axxxaaxx")); // 2
		System.out.println(last2("xxaxxaxxaxx")); // 3
		System.out.println(last2("xaxaxaxx")); // 0
		System.out.println(last2("xxxx")); // 2
		System.out.println(last2("13121312")); // 1
		System.out.println(last2("11212")); // 1
		System.out.println(last2("13121311")); // 0
		System.out.println(last2("1717171")); // 2
		System.out.println(last2("hi")); // 0
		System.out.println(last2("h")); // 0
		System.out.println(last2("")); // 0
	}

	public static int last2(String str) {
		String lasttwo = str;
		if(str.length() > 2) {
			lasttwo = str.substring(str.length()-2);
		}
		int counter = 0;

		for(int i = 0; i < str.length()-2; i++) {
			if(str.substring(i,i+2).equals(lasttwo)) counter++;
		}

		return counter;
	}
}
