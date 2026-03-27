package Recursion;
import java.util.Scanner;

/**Tower of Hanoi Problem:  |FROM| |AUX| |TO|
 *                        '''''''''''''''''''''
 * Total steps = (2^n)-1
 * n=1 -> step 1
 * n=2 -> step 3
 * n=3 -> step 7
 * n=4 -> step 15
 * The Secrey by Rhonda byers
 */

public class TowerOfHanoi {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Disc: ");
        int n = sc.nextInt();
        towerOfHanoi(n,'A','B','C');
        System.out.println("Total steps are: "+count);
        sc.close();
    }

    public static void towerOfHanoi(int n, char from, char aux, char to) {
        count++;
        if(n==1){
            System.out.println("Move Disk from "+from+" to "+to);
            return;
        }
        towerOfHanoi(n-1, from, to, aux);
        System.out.println("Move Disk from "+from+" to "+to);
        towerOfHanoi(n-1, aux, from, to);
    }
}
