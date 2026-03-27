import java.util.Scanner;
class Q21{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Rows: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n){
		int star=1;	int num=n;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=star;j++)									System.out.print(num+"\t");
		star++;	num--;
		System.out.println();
		}
	}
}
