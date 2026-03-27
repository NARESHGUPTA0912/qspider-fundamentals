package Revision;
public class FreqOfArrayElements {
    public static void freqOfArrayElements(int[] arr){
        boolean[] visited = new boolean[arr.length];
        
        for(int i=0; i<arr.length; i++){
            if(visited[i])
                continue;
            int count = 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i]+" occurs "+count+" time(s)");
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,21,32,12,22,1,21,32,1,1,12};
        freqOfArrayElements(arr);
    }
}
