/*
 * Given a string, return true if it ends in "ly"
 */
public class EndsLy {
	public static void main(String[] args) {
		System.out.println(endsLy("oddly")); //true
		System.out.println(endsLy("y")); // false
		System.out.println(endsLy("oddy")); // false
		System.out.println(endsLy("oddl")); // false
		System.out.println(endsLy("olydd")); // false
		System.out.println(endsLy("ly")); // true
		System.out.println(endsLy("")); // false
		System.out.println(endsLy("falsey")); // false
		System.out.println(endsLy("evenly")); // true
	}

	public static boolean endsLy(String str) {
		if(str.length() < 2) return false;
  		if(str.substring(str.length()-2).contains("ly")) return true;
  		return false;
	}
}
