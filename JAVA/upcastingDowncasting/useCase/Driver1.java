package upcastingDowncasting.useCase;

public class Driver1 {
	public static void main(String[] args) {
		Object o="abcde";
		System.out.println(o);
		System.out.println((String)o+100);
		System.out.println("--------");
		String s=(String)o;
		System.out.println(s+100);
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println("================");
		System.out.println(((String)o).length());
		
	}

}
