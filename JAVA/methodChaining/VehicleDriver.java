package methodChaining;

public class VehicleDriver {
    public static void main(String[] args) {
		Vehicle v=new Bike();
		v.start().drive().stop();
		
		String s="Hello World";
		
	int res=	s.toUpperCase().substring(4).length();
	System.out.println(res);
	}
}
