package Q25_To_Q;

public class RemoveElement {
    public static void main(String[] args) {
        int []a = {10,20,30,20,40,20,50};
        int pos=2;
        for(int i=pos; i<a.length-1; i++){
            a[i] = a[i+1];
        }
        a[a.length-1] = 0; // Optional: Set the last element to 0 or any default value
        for(int x: a)
            System.out.print(x+" ");
    }
}
