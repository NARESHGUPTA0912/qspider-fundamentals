//number and digit sum both prime
import java.util.Scanner;
class Prime{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the range: ");
		int range=sc.nextInt();
		int count=0;
		for(int i=1;i<=range;i++){
			if(isPrime(i) && isPrime(getDigitSum(i))){
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.print("\nTotal Such Numbers are: "+count);

	}
	public static boolean isPrime(int n) {
        	if(n<2)
			return false;
		else if(n==2 || n==3)
			return true;
		else if(n%2==0)
			return false;
		for(int i=3;i*i<=n;i+=2){
			if(n%i==0)
				return false;
		}
    return true;
    }  
    public static int getDigitSum(int n){
	int sum=0;
	while(n>0){
		sum=sum+n%10;
	n/=10;
	}
   return sum;
   } 
}







