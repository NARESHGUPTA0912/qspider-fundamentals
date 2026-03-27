import java.util.Scanner;
class Q243{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Rows: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n){

		int num=n*n;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i%2==1)
					System.out.printf("%5d", num--);
				else
					System.out.printf("%5d", num++);
			}
		if(i%2==1)
			num=num-(n-1);
		else
			num=num-(n+1);			
		System.out.println();
		}
	}
}
