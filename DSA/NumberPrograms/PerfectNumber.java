class PerfectNumber{
	public static void main(String[] args){
		// Scanner sc=new Scanner(System.in);
		// System.out.println("Enter the Number: ");
		// int n=sc.nextInt();
		// if(isPerfect(n))
		// 	System.out.println(n+" is a Perfect Number");
		// else
		// 	System.out.println(n+" is NOT a Perfect Number");
		pattern(5);

	}
	public static boolean isPerfect(int n) {
        	if(n<6)
			return false;
		int sum=1,	i=2;
		while(i*i<=n){
			if(n%i==0){
                int fact1=i,  fact2=n/i;
                if(fact1!=fact2)
				    sum=sum+fact1+fact2;
                else
                    sum=sum+fact1;
            }
	i++;
	}
    return n==sum;
    }

	public static void pattern(int n){
		for(int i=0; i<n; i++){
			int num=n;
			for(int j=n-i; j>0; j--){
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
		}
	}
}
