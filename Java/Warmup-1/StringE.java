/*
 * Return true if the given string contains between 1 and 3 'e' chars
 */
public class StringE {
	public static void main(String[] args) {
		System.out.println(stringE("Hello")); // true
		System.out.println(stringE("Heelle")); // true
		System.out.println(stringE("Heelele")); // false
		System.out.println(stringE("Hll")); // false
		System.out.println(stringE("e")); // true
		System.out.println(stringE("")); // false
	}

	public static boolean stringE (String str) {
		int length = str.length();
		int counter = 0;

		for(int i = 0; i < length; i++) {
			char isE = str.charAt(i);
			if(isE == 'e') {
				counter += 1;
			}
		}

		if(counter >= 1 && counter <= 3) {
			return true;
		}
		return false;
	}
}
