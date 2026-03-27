
import java.util.Scanner;

public class FrequencyArray {

    public static void buildFreqArray(int[] a) {

        if (a == null || a.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        int min = a[0], max = a[0];

        // Find min and max
        for (int x : a) {
            if (x > max) max = x;
            if (x < min) min = x;
        }

        // Create frequency array
        int[] freq = new int[max - min + 1];

        // Count frequency
        for (int x : a) {
            freq[x - min]++;
        }

        // Print result
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((i + min) + " occurs " + freq[i] + " times");
            }
        }

        int elem = a[0];
        int maxFreq = 1;

        for(int i = 0; i<freq.length;i++){
            if(freq[i]>maxFreq){
                maxFreq = freq[i];
                elem = i+min;
            }

            /*
                
             */
        }
        System.out.println(elem + "have Max Frequency which is: " + maxFreq);

        // for get the first index of nonrepeat number
        // int indexNo = 0;
        // for(int i=0; i<a.length; i++){
        //         if(freq[a[i]-min]==1){
        //             indexNo = i;
        //         }
        // }
        // System.out.println("First Index of NonRepeat Number: "+indexNo);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nFrequency of elements:");
        buildFreqArray(arr);
        // sc.close();
    }
}
