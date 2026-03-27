package String.Program1_Program25;

public class P14ToP16 {
    public static void replaceString(){
        String s = "Hello Java World";
        // a) using replace()
        String s1 = s.replace(" ", "_");
        System.out.println("First Way: "+s1);

        //  b) without replace()
        String res = "";
        for(char c: s.toCharArray()){
            if(c == ' '){
                res += '_';
            }else 
                res+=c;
        }
        System.out.println("Second Way :"+res);
    }

    public static void checksDigit(){
        String s="12345";
        boolean flag = true;
        for(char c: s.toCharArray()){
            if(!Character.isDigit(c)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Only Digits");
        }else{
            System.out.println("Not Only Digits");
        }
    }

    public static void removePathFromFileName(){
        String path = "C:\\Users\\Public\\Qspider Classes\\DSA\\String\\P14ToP16.java";
        int index = path.lastIndexOf("\\");
        String file = path.substring(index+1);
        System.out.println(file);
    }

    public static void main(String[] args) {
        // replaceString();
        // checksDigit();
        removePathFromFileName();
    }
}
