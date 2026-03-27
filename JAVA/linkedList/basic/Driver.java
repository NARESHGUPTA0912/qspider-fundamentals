package linkedList.basic;

public class Driver {
	public static void main(String[] args) {
		House h1=new House();
		System.out.println(h1.name);
		h1.name="ABCD";
		System.out.println(h1.name);
		System.out.println(h1.name.length());
		System.out.println(h1.name.toLowerCase());
		System.out.println(h1.name.charAt(2));
	}

}
