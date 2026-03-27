package hasARelationship.aggregation;

public class Car {
    Engine e;
	
	//Setter Injection
	/*public void setEngine(Engine e) {
		this.e = e;
	}*/
	
	//Constructor Injection
	Car(Engine e) {
		this.e = e;
	}

}
