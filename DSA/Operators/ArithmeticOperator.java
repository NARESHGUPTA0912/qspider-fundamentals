public class ArithmeticOperator {
    
    public static void Q1(){
        int n = 5783;
        System.out.println("Number: "+n);
        System.out.println("Last digit of number"+n%10);
        System.out.println("Last two Digit of number"+n%100);
        System.out.println("After Remove Last Digit:" + n/10);
        System.out.println("After Remove Last two Digit: "+n/100);
    }

    public static void Q2(){
        int n = 5783;
        System.out.println(n%10);
        n/=10;
        System.out.println(n%10);
        n/=10;
        System.out.println(n%10);
        n/=10;
        System.out.println(n%10);
    }

    public static void Q3(){
        int n = 5783;
        int digit1 = (n/1000)%10;
        System.out.println(digit1);
        int digit2 = (n/100)%10;
        System.out.println(digit2);
        int digit3 = (n/10)%10;
        System.out.println(digit3);
        int digit4 = n%10;
        System.out.println(digit4);
    }

    public static void Q4_1(int a, int b){
        System.out.println("a & b before swapping: " + a + " & " + b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a & b after swapping: " + a + " & " + b);
    }

    public static void Q4_2(int a, int b){
        System.out.println("a & b before swapping: " + a + " & " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a & b after swapping: " + a + " & " + b);
    }

    public static void Q5_1(int a, int b, int c){
        System.out.println("a, b, c before swapping: "+a+", "+b+", "+c);
        int temp = a;
        a=b;
        b=c;
        c=temp;
        System.out.println("a, b, c after swapping: "+a+", "+b+", "+c);
    }

    public static void Q5_2(int a, int b, int c){
        System.out.println("a, b, c before swapping: "+a+", "+b+", "+c);
        a=a+b+c;
        b=(a-b)-c;
        c=(a-b)-c;
        a=(a-b)-c;
        System.out.println("a, b, c after swapping: "+a+", "+b+", "+c);
    }

    public static void Q6(){
        int cp = 120;
        int sp = 160;
        // double profit = sp-cp;
        // double proPercent = (profit*100)/120;
        double proPercent = ((sp-cp)*100)/120;
        System.out.println(proPercent);
    }

    public static void Q7(){
        int cp = 120;
        int sp = 90;
        // double profit = sp-cp;
        // double proPercent = (profit*100)/120;
        double lossPercent = ((sp-cp)*100)/120;
        System.out.println(lossPercent);
    }

    public static void Q8(){
        int n=12345;
        int lastDigit = n-(n/10)*10;
        System.out.println(lastDigit);
    }

    public static void Q9(){
        int n=903;
        int reverseNumber= (n%10)*100+((n/10)%10)*10+n/100;
        System.out.printf("Reverse number is: %d",reverseNumber);
    }

    public static void Q10(){
        int n=123;
        int sum = (n%10)+((n/10)%10)+((n/100)%10);
        System.out.println(sum);
    }

    public static void Q11(){
        int x = 5 / 2 * 2;
        System.out.println(x); // 4
    }

    public static void Q12(){
        int x = 5 * 2 / 2;
        System.out.println(x); // 5
    }

    public static void Q13(){
        int x = 1+2*3/4;
        System.out.println(x); // 2
    }

    public static void Q14(){
        int x = 1+2/3*4;
        System.out.println(x); // 1
    }

    public static void Q15(){
        int x = 100/10*2%3;
        System.out.println(x); // 2
    }

    public static void Q16(){
        int n=128;
        int rev = (n%10)*100 + ((n/10)%10)*10 + (n/100);
        System.out.println(rev); // 821
    }

    public static void main(String[] args) {
        Q2();
    }
}
