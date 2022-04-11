import java.util.Arrays;

public class Anagram {

    public static boolean anagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] resultA = a.toCharArray();
        char[] resultB = b.toCharArray();

        Arrays.sort(resultA);
        Arrays.sort(resultB);
        a = Arrays.toString(resultA);
        b = Arrays.toString(resultB);

        if (a.equals(b)) {
            return true;
        } else {
            return false;
        }
    }

    public static String getToLowCase(String a) {
        return a.toLowerCase();
    }

    public static String getString(String a) {
        return a;
    }
}