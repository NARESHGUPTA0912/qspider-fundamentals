import java.util.Scanner;
class DissariumInRange{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter start: ");
		int start=sc.nextInt();
		System.out.println("ENter end: ");
		int end=sc.nextInt();
		int count=0;
		for(int i=start;i<=end;i++){
			if(isDissarium(i)){
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\nTotal Such Numbers are: "+count);
	}

	public static boolean isDissarium(int n){
		int num=n;	int sum=0;
		int digit=getDigitCount(n);
		while(n>0){
			sum=sum+getPower(n%10, digit--);
		n/=10;
		}
	return num==sum;
	}
	public static int getPower(int a, int b){
		int pow=1;
		for(int i=1;i<=b;i++)
			pow*=a;
	return pow;
	}
	public static int getDigitCount(int n){
		int count=0;
		while(n>0){
			count++;
		n/=10;
		}	
	return count;
	}
}







