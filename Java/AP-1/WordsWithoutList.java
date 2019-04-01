/*
 * Given an array of strings, return a new List (e.g. an ArrayList)
 * where all the strings of the given length are omitted.
 */
public class WordsWithoutList {
    public List wordsWithoutList(String[] words, int len) {
        List<String> wordsWithout = new ArrayList<String>();
        
        for(int i = 0; i < words.length; i++) {
          if(!(words[i].length() == len)) {
            wordsWithout.add(words[i]);
          }
        }
        
        return wordsWithout;
      }
}