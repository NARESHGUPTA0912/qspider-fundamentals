public class MergeSort {
    
    public static int[] mergeTwoArray(int[] a, int[]b){
        int i=0;
        int[] merged = new int[a.length+b.length]; 
        for(int x: a){
            merged[i++] = x;

        }
        for(int x: b){
            merged[i++] = x;
        }
        return merged;
    }

    public static int[] zigZagMerge(int[] a, int[]b){
        int[] merged = new int[a.length+b.length]; 
        int idx1=0, idx2=0, mergeIdx=0;
        while(idx1<a.length && idx2 < b.length){
            if(mergeIdx%2==0){
                merged[mergeIdx++]=a[idx1++];
            }else{
                merged[mergeIdx++]=b[idx2++];
            }
        }
        while(idx1 < a.length){
            merged[mergeIdx++] = a[idx1++];
        }
        while(idx2<b.length){
            merged[mergeIdx++] = b[idx2++];
        }
        return merged;
    }
    public static int[] mergeSort(int[] a, int[]b){
        int[] merged = new int[a.length+b.length]; 
        int idx1=0, idx2=0, mergeIdx=0;
        while(idx1<a.length && idx2 < b.length){
            if(a[idx1]<b[idx2]){
                merged[mergeIdx++]=a[idx1++];
            }else{
                merged[mergeIdx++]=b[idx2++];
            }
        }
        while(idx1 < a.length){
            merged[mergeIdx++] = a[idx1++];
        }
        while(idx2<b.length){
            merged[mergeIdx++] = b[idx2++];
        }
        return merged;
    }

    public static void divide(int[] a, int start, int end){
        if(start<end){
            int mid = start+(end-start)/2;
            divide(a, start, mid);
            divide(a, mid+1, end);
            merge(a,start,mid,end);
        }
    }

    private static void merge(int[] a, int start, int mid, int end) {
        int merged[] = new int[end-start+1];
        int idx1=start, idx2=mid+1, idx=0;

        while(idx1<=mid && idx2<=end){
            if(a[idx1]<a[idx2]){
                merged[idx++]=a[idx1++];
            }else{
                merged[idx++] = a[idx2++];
            }
        }
        while(idx1 <= mid){
            merged[idx++] = a[idx1++];
        }
        while(idx2 <= end){
            merged[idx++] = a[idx2++];
        }
        for(int i=0,j=start;i<merged.length;i++,j++){
            a[j] = merged[i];
        }
        for(int x: merged){
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        // int []a= {1,2,4,3};
        int []b= {2,1,4,7,3};

        // int []merge = mergeTwoArray(a, b);
        // for(int x: merge){
        //     System.out.print(x + " ");
        // }

        // System.out.println("\nZig Zag Array: ");
        // int []zigZagMerge = zigZagMerge(a, b);
        // for(int x: zigZagMerge){
        //     System.out.print(x + " ");
        // }
        
        // System.out.println("\nMerge Sort Array: ");
        // int []mergeSort = mergeSort(a, b);
        // for(int x: mergeSort){
        //     System.out.print(x + " ");
        // }

        System.out.println("\nMergeSort Array Algorithm...");
        divide(b, 0, b.length-1);
    }
}
