package Q1_To_Q24;

public class SumExceptSelf {
    public static void main(String[] args) {
        int []a = {10,20,30,40,50};
        int total = 0;
        for(int x: a)
            total+=x;
        for(int x: a){
            System.out.print((total-x+" "));
        }
    }
}
