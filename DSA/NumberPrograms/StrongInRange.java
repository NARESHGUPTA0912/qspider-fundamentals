import java.util.Scanner;
class StrongInRange{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter start: ");
		int start=sc.nextInt();
		System.out.println("ENter end: ");
		int end=sc.nextInt();
		int count=0;
		for(int i=start;i<=end;i++){
			if(isStrong(i)){
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\nTotal Such Numbers are: "+count);
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







