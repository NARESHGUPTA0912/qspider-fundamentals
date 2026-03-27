import java.util.Scanner;
class Q147{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Rows: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	int mid=n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int j=1;j<=star;j++)
				System.out.print("* ");

		if(i<mid){
			star+=2;		space--;
		}else{
			star-=2;		space++;
		}			
		System.out.println();
		}
	}
}
