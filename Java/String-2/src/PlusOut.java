public class PlusOut {

    public String plusOut(String str, String word) {
        StringBuilder result = new StringBuilder();
        char[] charWord = word.toCharArray();

        int occur = 0;
        
        for(int i = 0; i < str.length(); i++) {
            for (char c : charWord) {
                if (str.charAt(i) != c) {
                    System.out.println(str.charAt(i));
                    System.out.println(c);
                    result.append(str.replace(str.charAt(i), '+'));
                }
            }
        }

        System.out.println(word + " = " + occur);

        return result.toString();
    }
}