package convertStringToCamelCase;

import java.lang.StringBuilder;

public class Solution {
    public static String toCamelCase(String s) {
        if (s==null || s=="") {
            return "";
        }

        String[] words = s.split("-| |_");
        StringBuilder builder = new StringBuilder();

        builder.append(words[0].charAt(0));
        for (int i = 1; i < words[0].length(); i++) {
            builder.append((words[0].charAt(i) + "").toLowerCase());
        }

        for (int i = 1; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (j == 0) {
                    builder.append((words[i].charAt(j) + "").toUpperCase());
                } else {
                    builder.append((words[i].charAt(j) + "").toLowerCase());
                }
            }
        }

        return builder + "";
    }
}
