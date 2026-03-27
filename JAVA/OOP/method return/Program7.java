class Program7{

	public static void main(String[] args){

		
		int totalSum=getSum(10, 20)+getSum(30, 40)+getSum(50, 60);
		System.out.println("Total Sum is: "+totalSum);		
	}

	public static int getSum(int a, int b){
		int sum=a+b;
		System.out.println("sum of "+a+" and "+b+" is: "+sum);	
	return sum;
	}
	
}



