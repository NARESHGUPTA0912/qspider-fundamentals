package String.Program1_Program25;

import java.util.Scanner;

public class P1_PrintStringLength{

    public static void printStringLengthInFiveWays(String s){
        
        // 1. Using for loop
        int count1=0;
        for(char _: s.toCharArray())
            count1++;
        System.out.println("Length (Method1): "+count1);

        // 2. Using while loop
        int i=0, count2 = 0;
        while(i < s.toCharArray().length){
            count2++;       i++;
        }
        System.out.println("Length (Method2): "+count2);

        // Using Exception
        int count3 = 0;
        try {
            while(true){
                s.charAt(count3);
                count3++;
            }
        } catch (Exception e) {
            System.out.println("Length (Method3): "+count3);
            
            //  Using Recursion
            System.out.println("Length (Method4): "+findLen(s));
        }

        System.out.println("Length (Method5): "+s.length());
    }

    public static int findLen(String s) {
       if(s.equals("")) return 0;
       return 1+findLen(s.substring(1));
    }

    public static String takeInputs(){
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }

    public static void main(String[] args) {
        //String str = "naresh";  // takeInputs();
        String s = takeInputs();
        printStringLengthInFiveWays(s);
    }
}