public class AutomorphicNumber{
    public static void main(String[] args) {
        System.out.println(isAutomorphic(11));
    }

    public static boolean isAutomorphic(int n){
        int sq = n*n;
        String rem = "", rem2 = "";

        while(n > 0){
            rem = sq%10 + rem;
            rem2 = n%10 + rem2;
            sq/=10;     n/=10;
        }
        return rem.equals(rem2);
    }
}