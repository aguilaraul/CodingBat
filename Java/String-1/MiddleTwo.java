public class MiddleTwo {
	public static void main(String[] args) {
		System.out.println(middlTwo("string")); //"ri"
		System.out.println(middlTwo("code")); //"od"
		System.out.println(middlTwo("Practice")); // "ct"
		System.out.println(middlTwo("ab")); // "ab"
		System.out.println(middlTwo("0123456789")); // "45"
	}

	public static String middlTwo(String str) {
		int middle = str.length()/2;
		return str.substring(middle-1,middle+1);
	}
}
