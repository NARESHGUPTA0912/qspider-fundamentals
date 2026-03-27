package dataType;

public class ProductDriver {
    public static void main(String[] args){
		System.out.println("This is my JAVA-Program");
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		
		p1.name="Shirt";
		p1.price=2345.6;
		p1.brand="Arrow";
		p2.name="Laptop";
		p2.price=832345.6;
		p2.brand="HP";
		p3.name="Mobile";
		p3.price=20345.6;
		p3.brand="One Plus";		

		System.out.println("=====Product1 details======");
		System.out.println("Object address is: "+p1);
		System.out.println("Name is: "+ p1.name);
		System.out.println("Price is: "+p1.price);
		System.out.println("Brand is: "+p1.brand);
		System.out.println("=====Product2 details======");
		System.out.println("Object address is: "+p2);
		System.out.println("Name is: "+ p2.name);
		System.out.println("Price is: "+p2.price);
		System.out.println("Brand is: "+p2.brand);
		System.out.println("=====Product3 details======");
		System.out.println("Object address is: "+p3);
		System.out.println("Name is: "+ p3.name);
		System.out.println("Price is: "+p3.price);
		System.out.println("Brand is: "+p3.brand);
		System.out.println("Program Ends");
	}
}
