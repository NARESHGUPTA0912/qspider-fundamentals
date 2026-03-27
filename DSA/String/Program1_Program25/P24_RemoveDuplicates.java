package String.Program1_Program25;

import java.util.LinkedHashSet;
import java.util.Set;

public class P24_RemoveDuplicates {
    
    public static void main(String[] args) {
        String s = "aaabbcccddee";
        System.out.println(removeAllDuplicates(s));
    }

    public static String removeConsecutiveDuplicates(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
        if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
            sb.append(s.charAt(i));
        }
    }
    return sb.toString();
}


    public static String removeAllDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256];

        for (char c : s.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                sb.append(c);
            }
        }
        return sb.toString();
}


    public static String removeDuplicateWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (i == 0 || !words[i].equals(words[i - 1])) {
                sb.append(words[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }

    static String removeDuplicateWords2(String s) {
        String[] words = s.split(" ");
        Set<String> set = new LinkedHashSet<>();

        for (String word : words) {
            set.add(word);
        }

        return String.join(" ", set);
    }

    static String removeCaseInsensitive(String s) {
        String[] words = s.split(" ");
        Set<String> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for (String w : words) {
            if (!set.contains(w.toLowerCase())) {
                set.add(w.toLowerCase());
                sb.append(w).append(" ");
            }
        }
        return sb.toString().trim();
    }

    static String removeWithoutCollection(String s) {
        String[] words = s.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (!result.contains(words[i] + " ")) {
                result += words[i] + " ";
            }
        }
        return result.trim();
    }

}
