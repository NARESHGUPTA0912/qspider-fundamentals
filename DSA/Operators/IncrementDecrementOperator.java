public class IncrementDecrementOperator {
    
    public static void Q1(){
        int a=10;
        int b=a++;
        System.out.println(a); //11
        System.out.println(b); //10
    }
    
    public static void Q2(){
        int a=10;
        int b=++a;
        System.out.println(a); //11
        System.out.println(b); //11
    }
    
    public static void Q3(){
        int a=20;
        a++;
        int b=a++;
        int c=++b;
        System.out.println(a); //22
        System.out.println(b); //22
        System.out.println(c); //22
    }
    
    public static void Q4(){
        int a=12;
        int b=a++;
        b++;
        int c=a++ + --b;
        System.out.println(a); //14
        System.out.println(b); //12
        System.out.println(c); //25
    }
    
    public static void Q5(){
        int a=10;
        a++;
        int b=++a;
        int c=a++ + ++b;
        b++;
        System.out.println(a); //13
        System.out.println(b); //14
        System.out.println(c); //25
    }

    public static void Q6(){
        int a=12;
        int b=20;
        int c  = a++ + b++ - ++a - --a;
        System.out.println(c); //5
    }

    public static void Q7(){
        int x=10;
        int y=5;
        int z  = x-- - --y + x++ + ++y;
        System.out.println(z); //20
    }

    public static void Q8(){
        int x=5;
        int result = x++ - --x +  x-- - --x;
        System.out.println(result); //2
    }

    public static void Q9(){
        int a=5;
        int b=10;
        int c = a-- + ++b - b-- + ++a;
        System.out.println(c); //10
    }

    public static void Q10(){
        int x=12;
        x=x++;
        x=x++;
        x=x++;
        x=++x;
        x=x++;
        System.out.println(x); //13
    }

    public static void Q11(){
        int x=12;
        int y=x++ + ++x;
        y++;
        int z=++y;
        int p=x++ - ++y + z++;
        System.out.println(x); //15
        System.out.println(y); //29
        System.out.println(z); //29
        System.out.println(p); //13
    }

    public static void Q12(){
        int a=12;
        int b=a++;
        b++;
        int c=a++ + --b;
        int d=a++ + ++b + c++;
        d++;
        c--;
        System.out.println(a); //15
        System.out.println(b); //13
        System.out.println(c); //25
        System.out.println(d); //53
    }

    public static void Q13(){
        int a=12;
        a++;
        ++a;
        int b=a++;
        b++;
        int c=a++ + --b;
        c--;--b;
        int d=++a + b++ + --c;
        System.out.println(a); //17
        System.out.println(b); //14
        System.out.println(c); //27
        System.out.println(d); //57
    }

    public static void Q14(){
        int a=8;
        int b=12;
        int c= ++a +b++;
        c--;--b;
        int d= c-- + ++b + ++a;
        int e= a + ++b +c + d++;
        System.out.println (++e); //87
    }

    public static void main(String[] args) {
        Q10();
    }
}
