package Revision;
public class SecondLargest {
    public static void secondLargest(int[] a){
        int largest = a[0];
        
        for(int i=0; i<a.length; i++)
            if(a[i]>largest)
                largest = a[i];

        int secondLargest = a[0];
        for(int i=0; i<a.length; i++)
            if(a[i]>secondLargest && a[i]<largest)
                secondLargest = a[i];
            
        System.out.println(secondLargest);
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1,12,1,22,56,79,93,23};
        secondLargest(arr);
    }
}
