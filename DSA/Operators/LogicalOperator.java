public class LogicalOperator {
    
    public static void Q1(){
        boolean a=true;
        boolean b=false;
        boolean c=true;
        boolean result = (a&&b) || (b&&c);
        System.out.println(result); // false
    }

    public static void Q2(){
        int x=5;
        int y=10;
        boolean result=(++x > 5) && (--y < 10);
        System.out.println(result); // true
        System.out.println(x); //6
        System.out.println(y); //9
    }

    public static void Q3(){
        int x=5;
        int y=10;
        boolean result=(x++ > 5) && (--y < 10);
        System.out.println(result); //false
        System.out.println(x); //6
        System.out.println(y); //10
    }

    public static void Q4(){
        boolean a=true;
        boolean b=false;
        boolean c=true;
        boolean result = (a||b) && (b||c);
        System.out.println(result); // true
    }
  
    public static void Q5(){
        int a=20;
        int b=30;
        System.out.println(a++>15 && b++>20); //true
        System.out.println(a); //21
        System.out.println(b); //31
    }
  
    public static void Q6(){
        int a=20;
        int b=30;
        System.out.println(a++>25 && b++>20); //false
        System.out.println(a); //21
        System.out.println(b); //30
    }
  
    public static void Q7(){
        int a=20;
        int b=30;
        System.out.println(a++>25 || b++>20); //true
        System.out.println(a); //21
        System.out.println(b); //31
    }
  
    public static void Q8(){
        int a=20;
        int b=30;
        System.out.println(a++>15 || b++>20); //true
        System.out.println(a); //21
        System.out.println(b); //30
    }

    public static void main(String[] args) {
        Q8();
    }
}
