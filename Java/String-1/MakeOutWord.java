public class MakeOutWord {
	public static void main(String[] args) {
		System.out.println(makeOutWord("<<>>", "Yay")); //"<<Yay>>"
		System.out.println(makeOutWord("<<>>", "WooHoo")); //"<<WooHoo>>"
		System.out.println(makeOutWord("[[]]", "word")); //"[[word]]"
	}

	public static String makeOutWord(String out, String word) {
		return out.substring(0,2) + word + out.substring(2);
	}
}
