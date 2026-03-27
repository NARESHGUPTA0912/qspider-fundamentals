import java.util.Scanner;

public class RemoveDuplicates {
    
    public static int[] removeDuplicates(int[] a){

        int max=a[0], min=a[0];
        for(int x: a){
            if (x > max) max = x;
            if (x < min) min = x;
        }

        // Create frequency array
        int[] freq = new int[max - min + 1];

        // Count frequency
        for (int x : a) {
            freq[x - min]++;
        }

        int size = 0;
        for(int i=0; i<freq.length; i++){
            if(freq[i]>0){
                size++;
            }
        }
        int j=0;
        int[] unique = new int[size];

        for(int i=0; i<freq.length; i++){
            if(freq[i]>0){
                unique[j++]=i+min;
            }
        }
        return unique;
    }

    public static int[] removeDuplicates2(int a[]){
        int n = a.length-1;

        for(int i=0; i<=n; i++){
            for(int j=i+1; j<=n; j++){
                if(a[i]==a[j]){
                    a[j]=a[n];
                    n--;    j--;
                }
            }
        }
        int unique[] = new int[n+1];
        for(int i=0; i<=n; i++){
            unique[i] = a[i];
        }

        return unique;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        a = removeDuplicates2(a);
        System.out.println("Array without Duplicates: ");
        for(int x: a){
            System.out.println(x);
        }
    }
}
