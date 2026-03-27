package finalKeyword.nonStaticFinalVariable;

public class Driver {
    public static void main(String[] args) {
		Car c1=new Car("TATA", "UP11201");
		Car c2=new Car(346547, "DL33401");
		Car c3=new Car("MH55678");
		
		c1.name="MG";
		
		
		c1.display();
		c2.display();
		c3.display();
	}
}
