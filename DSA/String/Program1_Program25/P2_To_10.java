package String.Program1_Program25;

public class P2_To_10 {
    
    public static void countNumericCharacters(){
        String s = "74na43re87sh02gu8p9ta7";
        int count = 0;
        for(char c: s.toCharArray()){
            if(c >= '0' && c <= '9')
                count++;
        }
        System.out.println("Numeric Count: "+count);
    }

    public static void countCharactersWithoutSpace(){
        String s = "SnAkEs WaTeR GuN";
        int count = 0;
        for(char c: s.toCharArray()){
            if(c != ' ')
                count++;
        }
        System.out.println("Characters Count Withou Space: "+count);
    }

    public static void countCharsWithoutSpecialChar(){
        String s = "$nAkE& WaTe4 G|_|N";
        int count = 0;
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c))
                count++;
        }
        System.out.println("Characters Count Exclude Special Character: "+count);
    }

    public static void countAllCharsSeprately(){
        String s = "$nAk3& d4!N1< WaT34, water B3AT G|_|N, gUn ki11 $nAke";
        int upper=0, lower=0, special=0, digit=0, space=0, count=0;
        for(char c: s.toCharArray()){
            count++;
            if(c >= 'A' && c <= 'Z') 
                upper++;
            else if(c >= 'a' && c <= 'z')
                lower++;
            else if(c >= '0' && c <= '9')
                digit++;
            else if(c==' ')
                space++;
            else
                special++;
        }

        System.out.println("Upper: "+upper);
        System.out.println("Lower: "+lower);
        System.out.println("Digit: "+digit);
        System.out.println("Space: "+space);
        System.out.println("Special: "+special);
        System.out.println("Total Count: "+count);
    }

    public static void countVowels(){
        String s = "Education";
        int count=0;
        s = s.toLowerCase();
        for(char c: s.toCharArray())
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        System.out.println("Vowels: " + count);
    }

    public static void printNumericIndex(){
        String s = "$nAk3& d4!N1< WaT34, water B3AT G|_|N, gUn ki11 $nAke";
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                System.out.print(i + "  ");
            }
        }
    }

    public static void printSpaceIndex(){
        String s = "$nAk3& d4!N1< WaT34, water B3AT G|_|N, gUn ki11 $nAke";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                System.out.print(i + "  ");
            }
        }
    }

    public static void printSegregateAlphaDigits(){
        String s = "74na43re87sh2gu8p9ta7";
        String alpha = "";
        String digit = "";
        for(char c: s.toCharArray()){
            if(c >= '0' && c <= '9')
                digit = c + digit;      // descending(reverse) order
            else
                alpha = alpha + c ;     // ascending order
        }
        System.out.println("Alpha: "+alpha + "\nDigit: "+digit);
    }

    public static void printSegregateAlphaDigitsInOrder(){
        String s = "74na43re87sh2gu8p9ta7";
        String alpha = "";
        String digit = "";
        for(char c: s.toCharArray()){
            if(Character.isLetter(c))
                alpha = alpha + c ;     // ascending order
            else
                digit = digit + c;      // asscending order
        }
        System.out.println("Alpha: "+alpha + "\nDigit: "+digit);
    }

    public static void printSegregateAlphaCase(){
        String s = "abEsWQSeL";
        String upper = "";
        String lower = "";
        for(char c: s.toCharArray()){
            if(Character.isUpperCase(c))
                upper = upper + c ;     // 
            else
                lower = lower + c;      // 
        }
        System.out.println("Upper: "+upper + "\nLower: "+lower);
    }

    public static void arrangeString(){
        String s = "abEsWQSeL";
        String res = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='A' && c<='Z')
                res=c+res;
            else    
                res=res+c;
        }
        System.out.println(res);
    }
    public static void arrangeStringOrder(){
        String s = "abEsWQSeL";
        String up = "", low="";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='A' && c<='Z')
                up=c+up;
            else    
                low=low+c;
        }
        System.out.println(up+low);
    }

    public static void main(String[] args) {
        printSegregateAlphaDigitsInOrder();
    }
    
}
