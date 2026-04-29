package mock;
// wajp to print prime factors of each digit in the number 12345
class Program1 {
    public static void main(String[] args) {
        System.out.println("Prime factors of each digit in the number 12345 are: ");
        int num =12345;
        printPrimeFactorInEachDigitOfANum(num);
    }

    public static void printPrimeFactorInEachDigitOfANum(int num){
        while(num > 0){
            int digit = num % 10;
            System.out.println("Prime factors of " + digit + " are: ");
            for(int i = 2; i <= digit; i++){
                if(isPrime(i) && digit % i == 0){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            num /= 10;
        }
    }

    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }

}