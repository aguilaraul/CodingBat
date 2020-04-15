public class Driver {

    public static void main(String[] args) {
        XYZMiddle xMiddle = new XYZMiddle();

        String[] tests = {"AAxyzBB", "AxyzBB", "AxyzBBB", "AAAxyzB", "xyzAxyzBBB"};
        String[] results = {"true", "true", "false", "false", "true"};

        /*for(int i = 0; i < tests.length; i++) {
            System.out.print(results[i]);
            System.out.print(" ---> ");
            System.out.println(xMiddle.xyzMiddle(tests[i]));
        } */

        System.out.println(xMiddle.xyzMiddle("AAAxyzB"));
        System.out.println("---");
        System.out.println(xMiddle.xyzMiddle("AAxyzBB"));
        System.out.println("---");
        System.out.println(xMiddle.xyzMiddle("xyzxyzxyzBxyzxyz"));
        System.out.println("---");
        System.out.println(xMiddle.xyzMiddle("AxyzBB"));
    }
}
