public class XYZMiddle {

    public boolean xyzMiddle(String str) {

        if(!str.contains("xyz")) {
            return false;
        }

        int index = str.length() / 2;
        String left = str.substring(0, index);
        String right = str.substring(index+1);

        System.out.println(left);
        System.out.println(left.length());
        System.out.println(right);
        System.out.println(right.length());
        System.out.println(str.substring(index-1, index+2));

        if(Math.abs(left.length() - right.length()) <= 1) {
            return str.substring(index-1, index+2).equals("xyz");
        }
        return false;
    }
}
