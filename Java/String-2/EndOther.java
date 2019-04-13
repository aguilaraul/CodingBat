public class EndOther {
    public boolean endOther(String a, String b) {
        String shorter = a.toLowerCase();
        String longer = b.toLowerCase();

        if(longer.length() < shorter.length()) {
            longer = a;
            shorter = b;
        }

        if(longer.substring(longer.length()-shorter.length()).contains(shorter)) {
            return true;
        }


        return false;
    }
}