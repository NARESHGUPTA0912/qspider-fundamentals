import java.util.Scanner;
class Q244{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Rows: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n){

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++)
				System.out.printf("%-4d", getNumber(n, i, j));		
		System.out.println();
		}
	}
	public static int getNumber(int n, int i, int j){
		int num=0;
		num=n*(j-1);
		if(j%2==1)
			num=num+i;
		else
			num=num+n-i+1;
	return num;
	}
}
