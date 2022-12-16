package stringEndsWith;

public class Kata {
    public static boolean solution(String str, String ending) {
        if (str == null || ending==null) {
            return false;
        }

        if (ending.length() > str.length()) {
            return false;
        }

        for (int i = ending.length() - 1, j = str.length() - 1; i >= 0 && j >= 0; i--, j--) {
            if ((ending.charAt(i)) != (str.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}
