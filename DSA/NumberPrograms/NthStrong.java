import java.util.Scanner;
class NthStrong{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter k: ");
		int k=sc.nextInt();
		printKthStrong(k);
	}
	public static void printKthStrong(int k){
		int count=0;
		for(int i=1;i<=2147483647 && i>0;i++){
			if(isStrong(i)){
				count++;
				if(count==k){
					System.out.println(k+"th Strong is: "+i);
				return;
				}
			}
		}
		System.out.println(k+"th Strong doesn't Exist!!");
	}
	public static boolean isStrong(int n) {
		int num=n, 	sum=0;
		while(n>0){
			sum=sum+getFactorial(n%10);
		n/=10;
		}
	return sum==num;
    	}
	public static int getFactorial(int n){
		int fact=1;
		for(int i=1;i<=n;i++){	
			fact=fact*i;
		}	
	return fact;
	} 
}







