package String.Program1_Program25;

public class P19_MergeString {
    public static String mergeAlternately(String s1, String s2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;
        while (i < s1.length() || j < s2.length()) {
            if (i < s1.length()) {
                merged.append(s1.charAt(i++));
            }
            if (j < s2.length()) {
                merged.append(s2.charAt(j++));
            }
        }
        return merged.toString();
    }

    public static void main(String[] args) {
        String s1 = "AnushKA";
        String s2 = "nAreSh";
        String result = mergeAlternately(s1, s2);
        System.out.println("Merged String: " + result); // Output: "adbcefg"
    }
}
