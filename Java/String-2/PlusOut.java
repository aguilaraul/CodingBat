public class PlusOut {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy"));
    }

    public static String plusOut(String str, String word) {
        String result = "";
        int sizeOfWord = word.length();
        char[] charWord = word.toCharArray();

        int occur = 0;
        
        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < charWord.length; j++) {
                if(str.charAt(i) != charWord[j]) {
                    System.out.println(str.charAt(i));
                    System.out.println(charWord[j]);
                    result += str.replace(str.charAt(i), '+');
                }
            }
        }

        System.out.println(word + " = " + occur);

        return result;
    }
}