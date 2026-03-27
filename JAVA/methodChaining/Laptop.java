package methodChaining;

public class Laptop {
    private String brand;
	private double price;
	private int ram;
	private int hd;
	Laptop() {
		
	}
	Laptop(String brand, double price, int ram, int hd) {
		this.brand=brand;
		this.price=price;
		this.ram=ram;
		this.hd=hd;
	}
	public Laptop getBrand() {
		System.out.println("Brand is: "+brand);
	return this;
	}
	public Laptop getPrice() {
		System.out.println("Price is: "+price);
		return this;
	}
	public Laptop getRam() {
		System.out.println("RAM is: "+ram);
		return this;
	}
	public Laptop getHd() {
		System.out.println("HD is: "+hd);
		return this;
	}
}
