package inheritanceProgram.variableHiding;

public class Car extends Vehicle{
	int x=30;
	
	public void display() {
		int x=40;
		System.out.println("Local x is: "+x);
		System.out.println("Car x is: "+this.x);
		System.out.println("Vehicle x is: "+super.x);
		System.out.println("Vehicle x is: "+((Vehicle)this).x);
		System.out.println("Transport x is: "+((Transport)this).x);
		
	}

}
