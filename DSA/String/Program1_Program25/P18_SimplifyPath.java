package String.Program1_Program25;

import java.util.Stack;

public class P18_SimplifyPath {
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");
        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue; // Skip empty and current directory
            } else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop(); // Go back to parent directory
                }
            } else {
                stack.push(part); // Add directory to stack
            }
        }
        return "/" + String.join("/", stack); // Join stack to form simplified path
    }

    public static void main(String[] args) {
        String path = "/a/./b/../../c/";
        System.out.println("Simplified Path: " + simplifyPath(path));
    }
}
