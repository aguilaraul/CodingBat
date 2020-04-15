public class GetSandwich {

    public String getSandwich(String str) {
        String result = "";

        if(str.contains("bread")) {
            int index = str.indexOf("bread");
            str = str.substring(index+5);
            index = str.lastIndexOf("bread");
            if(index == -1) {
                return result;
            }
            result = str.substring(0, index);
        }

        return result;
    }
}