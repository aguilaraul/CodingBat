public class MakeTags {
	public static void main(String[] args) {
		System.out.println(makeTags("i", "Yay")); //"<i>Yay</i>"
	}

	public static String makeTags(String tag, String word) {
		return "<"+tag+">" + word + "</"+tag+">";
	}
}
