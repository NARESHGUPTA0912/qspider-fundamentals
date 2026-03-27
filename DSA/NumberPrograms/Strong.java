import java.util.Scanner;
class Strong{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		if(isStrong(n))
			System.out.println(n+" is a Strong Number");
		else
			System.out.println(n+" is a NOT Strong Number");
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







