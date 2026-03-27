package Q25_To_Q;

public class InsertElement {
    public static void main(String[] args) {
        int []a = {10,20,30,40,50};
        int pos = 2; // Position to insert the new element
        int element = 25; // Element to be inserted

        // Shift elements to the right to make space for the new element
        for(int i=a.length-1; i>pos; i--){
            a[i] = a[i-1];
        }
        // Insert the new element at the specified position
        a[pos] = element;

        // Print the updated array
        for(int x: a)
            System.out.print(x+" ");
    }
}
