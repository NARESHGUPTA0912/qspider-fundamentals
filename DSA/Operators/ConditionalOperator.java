public class ConditionalOperator {
    
    public static void Q1(){
        int a = 5, b = 10;
        int c = (a > b) ? a++ : b++;
        System.out.println(a + " " + b + " " + c); // 5 11 10
    }

    public static void Q2(){
         int a = 3, b = 4, c = 5;
         int result = (a > b ? (a>c?a:c) : (b>c?b:c));
         System.out.println(result); //5
    }

    public static void Q3(){
         int x = 10;
         int y = 5;
         int z = (x > y) ? (x < 15 ? x : y) : (x > 5 ? y : x);
         System.out.println(z); //10
    }

    public static void Q4(){
         int x = 10;
         int y = 5;
         int z = 7;
         int result = (x < y)  ?  (y < z ? z : y)  : x;
         System.out.println(result); //10
    }

    public static void Q5(){
        int a = 1, b = 2, c = 3;
        int result = a < b ? a < c ? c : a : b;
        System.out.println(result); // 3
    }

    public static void Q6(){
        int a = 5;
        int b = 10;
        int c=(a>b) ? b++ : (a<b ? --b : b) ;
        System.out.println(c); //9
    }
    
    public static void Q7(){
        int value=10;
        int result=(value>5) ? (value<8?1:2) : 3;
        System.out.println(result); //2
    }
    
    public static void Q8(){
         int x=5, y=7, z=3;
         int result=(x>y) ? (x>z? x:z) : (y>z ? y:z);
         System.out.println(result); //7
    }
    
    public static void Q9(){
         int x=5, y=7, z=3;
         int result=(x<y) ? (x<z? x:z) : (y<z ? y:z);
         System.out.println(result); //3
    }
    
    public static void Q10(int n){
        String msg = (n%2==0) ? "Even Number" : "Odd Number";
        System.out.println("Number is: "+n+"\n"+msg);
    }
    
    public static void Q11(int n){
        n=897;
        String result = (n>=100 && n<=999) ? "Yes" : "No";
        System.out.println(result);
    }

    public static void Q12(int n){
        n=23;
        String result = ((n%3==0 && n%5==0) ? "Divisible by 3 and 5" : (n%3==0) ? "Divisible by 3" : (n%5==0) ? "Divisible by 5":"None");
        System.out.println(result);
    }

    public static void Q13(){
        int x=12, y=4;
        String result = (x%y==0) ? "y is a factor of x" : "y is not a factor of x";
        System.out.println(result);
    }

    public static void Q14(int a, int b, int c){
        a=3;    b=4;    c=5;
        boolean isValid = (a+b>c) && (a+c>b) && (b+c>a);
        String result = isValid?"The sides form a valid Triangle.":"The sides do not form a valid Triangle.";
        System.out.println(result);
    }

    static void Q15(int year) {
    System.out.println(
        (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)
        ? "true"
        : "false"
    );
    }

    static void Q16(char ch) {
        System.out.println((ch >= 'A' && ch <= 'Z') ? "Uppercase" : "Not Uppercase");
    }

    static void Q17(char ch) {
        System.out.println((ch >= 'a' && ch <= 'z') ? "Lowercase" : "Not Lowercase");
    }

    static void Q18(char ch) {
    System.out.println(
        ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
        ? "Alphabet" : "Not Alphabet"
    );
    }

    static void Q19(char ch) {
    String result =
        (ch >= 'A' && ch <= 'Z') ? "Uppercase" :
        (ch >= 'a' && ch <= 'z') ? "Lowercase" :
        (ch >= '0' && ch <= '9') ? "Digit" :
        "Special Character";
    System.out.println(result);
    }

    static void Q20(int a, int b) {
    System.out.println(a > b ? a : b);
    }

    static void Q21(int a, int b) {
    System.out.println(a < b ? a : b);
    }

    static void Q22(int a, int b, int c) {
    int big = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
    System.out.println(big);
    }

    static void Q23(int a, int b, int c) {
    int small = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
    System.out.println(small);
    }

    static void Q24(int a, int b, int c) {
    int x = a < b ? (a < c ? a : c) : (b < c ? b : c);
    int z = a > b ? (a > c ? a : c) : (b > c ? b : c);
    int y = a + b + c - x - z;
    System.out.println(x + " " + y + " " + z);
    }

    static void Q25(int a, int b, int c) {
    int second =
        (a > b && a < c) || (a > c && a < b) ? a :
        (b > a && b < c) || (b > c && b < a) ? b :
        c;
    System.out.println(second);
    }

    static void Q26(int a, int b, int c, int d) {
    int big = (a > b ? a : b) > (c > d ? c : d)
              ? (a > b ? a : b)
              : (c > d ? c : d);
    System.out.println(big);
    }

    static void Q27(int a, int b, int c, int d) {
    int small = (a < b ? a : b) < (c < d ? c : d)
                ? (a < b ? a : b)
                : (c < d ? c : d);
    System.out.println(small);
    }

    static void Q28(int marks) {
    String result =
        marks >= 75 ? "Distinction" :
        marks >= 60 ? "First Class" :
        marks >= 50 ? "Second Class" :
        marks >= 35 ? "Pass" :
        "Fail";
    System.out.println(result);
    }

    public static void main(String[] args) {
        Q15(2000);
    }
}
