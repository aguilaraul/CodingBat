public class GetSandwich {
    public static void main(String[] args) {
        getSandwich("xxbreadjambreadyy");
    }

    public static String getSandwich(String str) {
        String[] sandwich = str.split("bread");

        for(String s:sandwich) {
            System.out.println(s);
        }

        return "";
    }
}