package String;

public class Permutation {
    static int count;
    public static void printPermutation(String prefix, String remaining){
        if(remaining.length()==0){
            System.out.print(prefix+"\t");
            count++;
            return;
        }
        for(int i=0; i<remaining.length();i++){
            char c = remaining.charAt(i);
            String left = remaining.substring(0,i) + remaining.substring(i+1);
            printPermutation(prefix+c,left);
        }
         // for(int i=0; i<remaining.length();i++)
        //     printPermutation(prefix+remaining.charAt(i), remaining.substring(0,i)+remaining.substring(i+1));
    }

    public static void printKthPermutation(String prefix, String remaining, int k){
        if(remaining.length()==0){
            count++;
            if(count==k)
                System.out.println(prefix);
            return;
        }
        for(int i=0; i<remaining.length();i++){
            printKthPermutation(prefix+remaining.charAt(i), remaining.substring(0,i)+remaining.substring(i+1),k);
        }
    }

    public static void main(String[] args) {
        String s = "car";
        // printPermutation("",s);
        printKthPermutation("",s,1);
        // System.out.println("Total Permutation: "+count);
    }
}
