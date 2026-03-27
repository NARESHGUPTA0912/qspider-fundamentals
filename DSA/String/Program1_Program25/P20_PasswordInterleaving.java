package String.Program1_Program25;

public class P20_PasswordInterleaving {
    public static void main(String[] args) {
        String s1 = "hackerrank";
        String s2 = "mountain";
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
        System.out.println("Merged String: " + merged.toString());
    }
}
