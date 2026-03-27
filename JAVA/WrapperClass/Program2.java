package WrapperClass;

public class Program2 {
    public static void main(String[] args) {
        int x = 520;
        Integer y = x; // Boxing
        Integer p = 100;
        Integer q = 100; // object cashing(-128 to +127)
        Long r = 100L;
        Long t = 100l;
        System.out.println(x+100);      //620
        System.out.println(y+100);      //620
        System.out.println(x>100);      //true
        System.out.println(y>100);      //true
        System.out.println(x==y);       //true
        System.out.println(p==q);       //true
        System.out.println(r==t);       //true

        // when a object is work with the value in the range of (-128 to +127) than one object is reused 
        // instead of creating new object. it is called object cashing if value is out of range then object cashing is not used.

        // By using wrapper class method toBinaryString(), toOctalString(), toHexString(), toString().
        //  we can convert decimal type of no into any type of number.

        // The process of converting string in any other type of data then it is known as parsing.
        // The process of converting any type of data into string type then it is known as Unparsing.
        // By using wrapper class method we can convert a string data into its original type which is called parsing mechanism.
    }    
}
