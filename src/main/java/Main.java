
public class Main {

    public static void main(String[] args) {

        String a = "Anagram";
        String b = "marGana";

        if (Anagram.anagram(a, b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

        System.out.println(Anagram.getString(b));
    }
}