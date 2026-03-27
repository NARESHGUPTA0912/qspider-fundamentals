package Q1_To_Q24;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            arr[i] = sum;
        }
        for(int x: arr)
            System.out.print(x+" ");
    }
}
