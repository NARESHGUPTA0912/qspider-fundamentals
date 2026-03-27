package NumberPrograms;

public class PrimeNumber {

    public static boolean isPrime2(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime3(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime4(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(int n){
        if(n<2)
            return false;
        else if(n==2 || n==3)
            return true;
        else if(n%2==0)
            return false;
        for(int i=3; i*i<=n; i+=2){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void checkPrime(int n){
        if(isPrime(n))
            System.out.println(n+" is aPrime Numbver");
        else
            System.out.println(n+ " is not a prime no.");
    }

    public static void printandCountPrime(int n){
        int count=0;
        int range=15;
        for(int i=1; i<=range; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\nTotal Prime Numbers are: "+count);
    }

    public static void kthPrime(int n){
        int count=0;
        int k = n;
        for(int i=1; ; i++){
            if(isPrime(i)){
                count++;
                if(count==k)
                    System.out.println(k);
            }
        }
        // System.out.println("\nTotal Prime Numbers are: "+count);
    }
    public static void oddPrime(int n){
        int count=0;
        int range = n;
        for(int i=1; i<=range; i++){
            if(isPrime(i)){
                count++;
                if(count%2==0)
                    System.out.println(i+" ");
            }
        }
        // System.out.println("\nTotal Prime Numbers are: "+count);
    }

    public static void checkSumOfDigitandNumberIsPrime(int n){
        int count=0;
        int range = n;
        for(int i=1; i<=range; i++){
            if(isPrime(i) && isPrime(getSumOfDigit(n))){
                count++;
                if(count%2==0)
                    System.out.println(i+" ");
            }
        }
        // System.out.println("\nTotal Prime Numbers are: "+count);
    }

    public static void getSumOfDigit(int n){
        int sum=0;
    }

    public static void main(String[] args) {
        // System.out.println(isPrime(1010576235));
        printandCountPrime(15);
    }
}
