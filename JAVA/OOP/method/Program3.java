class Program3{
	public static void test(){	
		System.out.println("Test starts");
		System.out.println("Test Ends!");
	}
	public static void main(String[] args){
		System.out.println("Main starts");
		demo();
		System.out.println("Main Ends!");	
	}
	public static void demo(){	
		System.out.println("Demo starts");
		test();
		System.out.println("Demo Ends!");
	}	
}



