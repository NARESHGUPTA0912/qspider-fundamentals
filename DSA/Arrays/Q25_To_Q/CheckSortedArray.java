package Q25_To_Q;

public class CheckSortedArray {
    public static void main(String[] args) {
        int []a = {1,3,2,3,4,5};
        boolean flag = true;
        for(int i=1; i<a.length; i++){
            if(a[i]<a[i-1]){
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("Sorted");
        else
            System.out.println("Not Sorted");
    }
}