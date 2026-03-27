package String;

import java.util.Arrays;

public class SortedCharacters {

    // first way using Arrays
    public static void sortedLowerCase(String s){
        char[] sorted = s.toCharArray();
        Arrays.sort(sorted);
        String sortedArray = new String(sorted);
        System.out.println(sortedArray);
    }

    // second way bubble sort
    public static void sortedString(String s){
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        String sorted = new String(arr);
        System.out.println("Sorted String: "+sorted);
    }

    // third way count sort (1 way)
    public static void countSortString(String s){
        s = s.toLowerCase();
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++)
            freq[s.charAt(i) - 'a']++;
        String res = "";
        for(int i=0; i<freq.length; i++)
            while(freq[i]-- > 0)
                res = res + (char)(i+'a');
        System.out.println(res);
    }
                // (2 way) AAbdessW
    public static void sortCharacters(String s){
        int[] freqU= new int[26];
        int[] freqL= new int[26];
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='A' && c<='Z')
                freqU[c-'A']++;
            else
                freqL[c-'a']++;
        }
        String res="";
        for(int i=0; i<freqL.length;i++){
            while(freqU[i]-- > 0)
                res = res + (char)(i+'A');
            while(freqL[i]-- > 0)
                res = res + (char)(i+'a');
        }
        System.out.println(res);
    }
                // (3 way) AAWbdess
    public static void sortCharacters2(String s){
        int[] freqU= new int[26];
        int[] freqL= new int[26];
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='A' && c<='Z')
                freqU[c-'A']++;
            else
                freqL[c-'a']++;
        }
        String res="";
        for(int i=0; i<freqL.length;i++)
            while(freqU[i]-- > 0)
                res = res + (char)(i+'A');
        for(int i=0; i<freqL.length;i++)
            while(freqL[i]-- > 0)
                res = res + (char)(i+'a');
        System.out.println(res);
    }
                // (4 way) AAWbdess
    public static void sortCharacters3(String s){
        int[] freq= new int[128];
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            freq[c]++;
        }
        String res="";
        for(int i=0; i<freq.length;i++)
            while(freq[i]-- > 0)
                res = res + (char)i;
        System.out.println(res);
    }

    public static void main(String[] args) {
        //  sortedString("baedebcd");
        // countSortString("bAEdeBcD");
        // sortedLowerCase("bAEdeBcD");
        sortCharacters3("bAsWdeAs");
    }
}
