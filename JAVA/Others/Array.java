package Others;
public class Array{

    public static void main(String[] args){

        double[] array1 = {12.3,23.4,33.43,441.2,221.34};
        for(double i : array1){
            System.out.print(i + " ");
        }

        System.out.println();

        String[] names = {"abhi ","ram ","shyam ","sita ","gita"};
        for(String i : names){
            System.out.print(i);
        }

        System.out.println();

        int[] array2 = {1,2,3,4,5,6};
        int length1=array1.length;
        for(int i : array2){
            System.out.print(i+" ");
        }

    }
}
