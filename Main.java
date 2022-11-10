public class Main {
    public static void main(String[] args) {
        String str1 = "cooked";
        String str2 = "talked";
        System.out.println(endsEd(str1));
        System.out.println(endsEd(str2));
    }
    private static boolean endsEd (String str) {
        boolean flag = false;
        if(str.charAt(str.length()-1) == 'd' && str.charAt(str.length()-2) == 'e') {
            flag = true;
        }
        return flag;
    }
}