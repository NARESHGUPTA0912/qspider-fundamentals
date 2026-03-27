import java.util.Scanner;
class Q241{
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
		int mid=n/2+1;
		int start=mid, 	end=mid;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j<=start || j>=end)
					System.out.print("* ");
				else
					System.out.print("  ");
		}
		if(i<mid){
			start--;		end++;
		}else{
			start++;		end--;
		}			
		System.out.println();
		}
	}
}
