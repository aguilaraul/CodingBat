/**
 * Count the number of "xx" in the given string. We'll say that
 * overlapping is allowed, so "xxx" contains 2 "xx".
 */
public class CountXX {
	public static void main(String[] args) {
		System.out.println(countXX("abcxx")); // 1
		System.out.println(countXX("xxx")); // 2
		System.out.println(countXX("xxxx")); // 3
		System.out.println(countXX("abc")); // 0
		System.out.println(countXX("Hello there")); // 0
		System.out.println(countXX("Hexxo thxxe")); // 2
		System.out.println(countXX("")); // 0
		System.out.println(countXX("Kittens")); // 0
		System.out.println(countXX("Kittensxxx")); // 2
	}

	public static int countXX(String str) {
		int counter = 0;

		for(int i = 0; i < str.length()-1; i++) {
			if(str.substring(i,i+2).equals("xx")) counter++;
		}

		return counter;
	}
}
