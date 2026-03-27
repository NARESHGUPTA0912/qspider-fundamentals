package String.CompressedString;

public class StringCompression {

    public static void main(String[] args) {
        String s = "aaabbccccd";
        System.out.println(compress2(s));
    }

    public static String compress(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                sb.append(s.charAt(i)).append(count);
                count = 1;
            }
        }
        return sb.toString();
    }
    
    public static String compress2(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                sb.append(count).append(s.charAt(i));
                count = 1;
            }
        }
        return sb.toString();
    }
}
