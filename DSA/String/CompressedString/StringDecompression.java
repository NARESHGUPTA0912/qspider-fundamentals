package String.CompressedString;

public class StringDecompression {
    
    public static void main(String[] args) {
        String s = "3a2b4c2d";
        String s2 = "a3b4c2d";
        System.out.println(decompress(s));
        System.out.println(decompress2(s));
    }

    public static String decompress(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            int count = Character.getNumericValue(s.charAt(i));
            char c = s.charAt(i + 1);
            for (int j = 0; j < count; j++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String decompress2(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int count = Character.getNumericValue(c);
                char nextChar = s.charAt(i + 1);
                for (int j = 0; j < count; j++) {
                    sb.append(nextChar);
                }
                i++; // Skip the next character since it's already processed
            } else {
                sb.append(c); // If it's not a digit, just append it
            }
        }
        return sb.toString();
    }
}
