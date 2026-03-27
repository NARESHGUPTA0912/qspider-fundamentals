package finalKeyword.nonStaticFinalVariable;

public class Car {
    String name;
	int price;
	final String carno;
	
	Car(String n, String cno){
		name=n;
		carno=cno;
	}
	Car(int p, String cno){
		price=p;
		carno=cno;
	}
	Car(String cno){
		carno=cno;
	}
	
	public void display() {
		System.out.println("Car Name: "+name);
		System.out.println("Car Price: "+price);
		System.out.println("Car No: "+carno);
		System.out.println("-------------------");
	}
}
