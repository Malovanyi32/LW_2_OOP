public class sum {
    public static void main(String[] args) {
        String str1 = "Ed1eJo6";
        String str2 = "andrii";
        System.out.println(getSum(str1));
        System.out.println(getSum(str2));
    }
    private static int getSum(String str) {
        int sum = 0;
        for(int i = 0; i<str.length();i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                int numericVal = Character.getNumericValue(str.charAt(i));
                sum += numericVal;
            }
        }
        return sum;
    }
}