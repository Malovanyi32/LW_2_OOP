public class foundWords {
    public static void main(String[] args) {
        String str = "London is wonderful city";
        getWords(str);
    }
    public static void getWords(String str) {
        String[] words = str.split(" ");
        System.out.println("words:");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}