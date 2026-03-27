class Car{
	int x=10;	

	public void test(){
		System.out.println("Test method starts");
		int x=20;
		System.out.println("Local x is: "+x);
		System.out.println("Object address from test is: "+this);
		System.out.println("x of object from test is: "+this.x);
	}

	public static void main(String[] args){
		System.out.println("This is main method");
		Car c1=new Car();
		System.out.println("Object address from main is: "+c1);
		System.out.println("x of object c1 from main is: "+c1.x);
		System.out.println("================");
		c1.test();
	}
}



