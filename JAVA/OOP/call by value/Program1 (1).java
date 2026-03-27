class Program1{

	public static void main(String[] args){
		int x=10;
		System.out.println("x is: "+x);//x is: 10
		test(x);//call by value
		System.out.println("x is: "+x);//x is: 10	
	}

	public static void test(int x){
		x=50;
	}
	
}



