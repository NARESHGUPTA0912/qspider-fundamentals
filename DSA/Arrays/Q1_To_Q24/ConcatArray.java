package Q1_To_Q24;

public class ConcatArray {
    public static void main(String[] args) {
        int []a = {1,2,3,4};
        int []b = new int[a.length*2];
        for(int i=0; i<a.length; i++){
            b[i] = a[i];
            b[i+a.length] = a[i];
        }
        for(int x: b){
            System.out.print(x+" ");
        }
    }
}
