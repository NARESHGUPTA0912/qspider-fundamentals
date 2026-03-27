package Revision;
public class SearchElement {

    public static int searchElementUsingLinearSearch(int[] arr, int key){
        if(arr.length == 0) {
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key)
                return i;
        }
        return -1;
    }

    public static void sortArray(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int searchElementUsingBinarySearch(int[] arr, int key){
        int left = 0, right = arr.length - 1;
        sortArray(arr);
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == key)
                return mid;
            else if(arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12,21,32,12,22,1,21,32,1,1,12};
        int key = 22;
        // int result = searchElementUsingLinearSearch(arr, key);
        int result2 = searchElementUsingBinarySearch(arr, key);
        // if(result != -1){
        //     System.out.println("Element found at index: " + result);
        // }else{
        //     System.out.println("Element not found in the array.");
        // }
        if(result2 != -1){
            System.out.println("Element found at index: " + result2);
        }else{
            System.out.println("Element not found in the array.");
        }
    }

}
