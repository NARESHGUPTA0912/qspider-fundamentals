package Recursion;

public class BulbSwitcher {
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);

        // int ans=0, i=1;
        // while(i*i <= n){
        //     ans++;
        //     i++;
        // }
        // return ans;
    }

    public static void main(String[] args) {
        BulbSwitcher bs = new BulbSwitcher();
        System.out.println(bs.bulbSwitch(25));
    }
}


