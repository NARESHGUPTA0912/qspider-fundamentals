package String;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class PalindromicString {
    
    public static void checkPalindrome(String s){
        String rev="";
        for(int i=0; i<s.length(); i++){
            rev = s.charAt(i) + rev;
        }
        if(s.equalsIgnoreCase(rev)){
            System.out.println("It is palindromic string");
        }else{
            System.out.println("It is not palindromic string"); 
        }
    }
    
    public static void checkPalindrome2(String s){
        int i=0, j=s.length()-1;
        boolean flag = true;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                flag = false;
                break;
            }i++;       j--;
        }
        if(flag){
            System.out.println("It is palindromic string");
        }else{
            System.out.println("It is not palindromic string"); 
        }
    }

    public static boolean isPalindrome(String s){
        int i=0, j=s.length()-1;
        s = s.toLowerCase();
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }i++;       j--;
        }return true;
    }

    public static void firstPalindrome(String[] words){
        for(String s: words){
            if(isPalindrome(s)){
                System.out.println(s + " is a first Palindrome String");
                return;
            }
        }System.out.println("Not found a Palindrome String");
    }

    public static void printAllPalindromicSubstring(String s){
        Set<String> set = new LinkedHashSet<>();
        for(int i=0; i<s.length(); i++){
            expandAroundCentre(s,i,i,set);
            expandAroundCentre(s,i,i+1,set);
        }
        for(String str: set){
            System.out.println(str);
        }
        System.out.println("Total Palindromic Substring are: "+set.size());
    }

    public static void expandAroundCentre(String s, int start, int end, Set<String> set){
        while(start>=0 && end<s.length() && s.charAt(start) == s.charAt(end)){
            set.add(s.substring(start,end+1));
            start--;        end++;
        }
    }
    public static int expandAroundCentre(String s, int start, int end){
        int count=0;
        while(start>=0 && end<s.length() && s.charAt(start) == s.charAt(end)){
            count++;
            start--;        end++;
        }
        return count;
    }

    public static void countSubstring(String s){
        int finalCount=0;
        for(int i=0; i<s.length(); i++){
            finalCount+=expandAroundCentre(s,i,i);
            finalCount+=expandAroundCentre(s,i,i+1);
        }
        System.out.println(finalCount);
    }

    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        // String[] words = {"hello", "bye", "tata", "racecar"};
        // firstPalindrome(words);
        printAllPalindromicSubstring(s);
    }
}
