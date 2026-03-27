package Q1_To_Q24;

public class CallByValue_CallByReference {
    static void changeValue(int x){
        x=100;
    }

    static void changeArray(int[] a){
        a[0] = 100;
    }

    public static void main(String[] args) {
        int x =10;
        changeValue(x);
        System.out.println(x);
        int[] a = {10,20,30,40,50};
        changeArray(a);
        System.out.println(a[0]);
    }
}
