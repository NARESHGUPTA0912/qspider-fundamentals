package Basics;

public class ASCIIValues {
    public static void main(String[] args) {
        int i = 0;
        int ch = 0;
        while(i<256){
            char c = (char) ch;
            System.out.print(c + "  ");
            ch++;    i++;
        }

        // System.out.println((char) a);
    }
}
