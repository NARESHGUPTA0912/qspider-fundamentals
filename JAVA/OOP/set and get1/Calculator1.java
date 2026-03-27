class Calculator1{
		
	public static int getSum(int x, int y){
		int z=x+y;
	return z;
	}

	public static void main(String[] args){
		int x1=10, y1=20;
		int x=30, y=40;
		int sum1=getSum(x1,y1);//30
		int sum2=getSum(x,y);//70
		int sum3=getSum(25, 35);//60
		System.out.println("1st sum is: "+sum1);
		System.out.println("2nd sum is: "+sum2);
		System.out.println("3rd sum is: "+sum3);
		int totalSum=sum1+sum2+sum3;
		System.out.println("Total SUm is: "+totalSum);
	}
}



