public class alternatelyStrings {
    public static void main(String[] args) {
        String str1 = "hcf5d";
        String str2 = "43fga3";
        System.out.println(getAlternatelyStr(str1, str2));
    }
    private static String getAlternatelyStr(String str1, String str2) {
        String shorterString = str2;
        boolean isLongerSecond = false;
        if (str1.length() < str2.length()) {
            shorterString = str1;
            isLongerSecond = true;
        }
        StringBuilder builder = new StringBuilder();
        int i;
        for (i = 0; i < shorterString.length(); i++) {
            builder.append(str1.charAt(i)).append(str2.charAt(i));
        }
        if (isLongerSecond)
            builder.append(str2.substring(i));
        else
            builder.append(str1.substring(i));
        return builder.toString();
    }
}