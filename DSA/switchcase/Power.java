package switchcase;

public class Power {
    public static int getPower(int base, int exp){
        int pow=1;
        for(int i=1; i<=exp; i++){
            pow *= base;
            pow++;
        }
        return pow;
    }
}
