package String;

public class FrequencyOfEachCharacters {
    
    public static void printFreq(String s){
        int[] freq= new int[128];
        for(int i=0; i<s.length(); i++)
            freq[s.charAt(i)]++;
        for(int i=0; i<freq.length;i++)
            if(freq[i]>0)
                System.out.println((char) i + " is: " + freq[i]+" times.");
    }
    
    public static String removeDuplicates(String s){
        int[] freq= new int[128];
        for(int i=0; i<s.length(); i++)
            freq[s.charAt(i)]++;
        String res = "";
        for(int i=0; i<freq.length;i++){
            if(freq[i]>0)
                res = res+(char)i;
        }
        return res;
    }



    public static void main(String[] args) {
        printFreq("SEFOFW454Wrerw33R##@");
    }
}
