package Java8Features.MethodReference;

public class Program1 {
    public static void main(String[] args) {
        A a = new B()::checker;
        a.printer();
    }
}

interface A{
    void printer();
}

class B{
    void checker(){
        System.out.println("Print from checker");
    }
}
