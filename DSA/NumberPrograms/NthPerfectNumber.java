import java.util.Scanner;
class NthPerfectNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter kth number: ");
		int k=sc.nextInt();
		int count=0;
		for(int i=1;;i++){
			if(isPerfect(i)){
				count++;
				if(count==k){
					System.out.print(k+"th perfect no: "+i);
					break;
				}
			}
		}
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
