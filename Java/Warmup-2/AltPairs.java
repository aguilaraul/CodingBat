/*
 * Given a string, return a string made of the chars at indexes
 * 0,1 4,5 8,9 ... so "kittens" yields "kien"
 */
public class AltPairs {
	public static void main(String[] args) {
		System.out.println(altPairs("kitten")); // "kien"
		System.out.println(altPairs("Chocolate")); // "Chloe"
		System.out.println(altPairs("CodingHorror")); // "Congrr"
		System.out.println(altPairs("yak")); // "ya"
		System.out.println(altPairs("ya")); // "ya"
		System.out.println(altPairs("y")); // "y"
		System.out.println(altPairs("")); // ""
		System.out.println(altPairs("ThisThatTheOther")); // "ThThThth"
	}

	public static String altPairs(String str) {
		String result = "";

		for(int i = 0; i < str.length(); i+=4) {
			int end = i+2;
			if(end > str.length())	end = str.length();
			result += str.substring(i,end);
		}

		return result;
	}
}
