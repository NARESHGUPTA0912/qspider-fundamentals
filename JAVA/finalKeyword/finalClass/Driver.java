package finalKeyword.finalClass;

public class Driver {
    public static void main(String[] args) {
		Vehicle v1=new Vehicle("TATA");
		System.out.println(v1.name);
		v1.name="Maruti";
		System.out.println(v1.name);
	}
}
