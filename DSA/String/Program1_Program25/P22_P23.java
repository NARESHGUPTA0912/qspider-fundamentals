package String.Program1_Program25;

public class P22_P23 {
    
    public static void sumOfNumeric(String s){
        int res = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                res = res + (int) c - '0';
            }
        }System.out.println(res);
    }

    public static void sumOfEvenNumeric(String s){
        int res = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                int even = (int) c - '0';
                if(even % 2 == 0){
                    res += even;
                }
            }
        }System.out.println(res);
    }


    public static void main(String[] args) {
        String s = "Ch23r6823v8328v";
        sumOfEvenNumeric(s);
    }
}
