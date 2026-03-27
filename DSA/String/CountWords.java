package String;

public class CountWords {
    // first way
    public static int getWordCount(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            // if logic moves RtoL or LtoR then logic can cause exception but this logic is safe for every testcase
            if(i==0 && c!=' ' || c!=' ' && s.charAt(i-1) == ' ')
                count++; 
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "One two three    four    five";
        System.out.println("Total Words Count: " + getWordCount(s));
        // second way
        int count  = s.trim().split("\s+").length;
        System.out.println("Total Count: "+count);
    }
}
