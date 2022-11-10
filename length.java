public class length {
    public static void main(String[] args) {
        String str = "sheeeeesh";
        System.out.println(BlocksLength(str));
    }
    private static int BlocksLength (String str) {
        char c = str.charAt(0);
        int max = 0;
        int lng = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                lng++;
            }
            else {
                c = str.charAt(i);
                lng = 1;
            }
            if (lng > max) max = lng;
        }
        return max;
    }
}