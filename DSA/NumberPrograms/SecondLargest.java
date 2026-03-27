public class SecondLargest {
    public static void main(String[] args) {
        int a[] = new int[] {10,20,3,2,1,2,03,22,3,9};
        System.out.println(secondLargest(a));
    }
    public static int secondLargest(int[] a){
        int max = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        int secMax = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]>secMax && a[i] != max){
                secMax = a[i];
            }
        }
        return secMax;
    }
}
