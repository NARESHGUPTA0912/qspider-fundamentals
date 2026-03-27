import java.util.Scanner;
class PerfectNumberInRange{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter start: ");
		int start=sc.nextInt();
		System.out.println("ENter end: ");
		int end=sc.nextInt();
		int count=0;
		for(int i=start;i<=end;i++){
			if(isPerfect(i)){
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\nTotal Such Numbers are: "+count);
	}
	public static boolean isPerfect(int n) {
        	if(n<6)
			return false;
		int sum=1;
		int i=2;
		while(i*i<=n){
			if(n%i==0){
                int fact1=i;    int fact2=n/i;
                if(fact1!=fact2)
				    sum=sum+fact1+fact2;
                else
                    sum=sum+fact1;
            }
	i++;
	}
    return n==sum;
    }
}
