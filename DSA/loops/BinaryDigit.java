public class BinaryDigit {
    public static int countBinaryDigit(int n){
        int count = 0;
        String binary="";
        while(n>0){
            count++;
            int bit=n%2;
            binary=bit+binary;
            n /= 2;
        }
        System.out.print(binary);
        return count;
    }

    public static void main(String[] args) {
        int binarydigits = countBinaryDigit(20);
         System.out.println();
        System.out.println(binarydigits);
    }
}
