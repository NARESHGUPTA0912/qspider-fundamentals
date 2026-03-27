package methodChaining;

public class LaptopDriver {
    public static void main(String[] args) {
		Laptop lp1=new Laptop("Dell", 55000.00, 8, 512);
		Laptop lp2=new Laptop("Apple", 150000.00, 16, 1024);
		Laptop lp3=new Laptop("HP", 65000.00, 8, 256);
		// Laptop lp4=new Laptop("Lenovo", 60000.00, 12, 512);
		// Laptop lp5=new Laptop("Asus", 70000.00, 16, 1024);
		
		lp1.getBrand().getHd().getPrice();
		System.out.println("--------------");
		Laptop l=lp2.getPrice().getHd().getRam().getBrand().getHd();
		System.out.println(lp2);
		System.out.println(l);
		System.out.println("--------------");
		lp3.getRam().getBrand();
	}
}
