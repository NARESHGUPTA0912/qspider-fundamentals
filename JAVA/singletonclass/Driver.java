package singletonclass;

public class Driver {
    public static void main(String[] args) {
		Manager m1=Manager.getInstance();//new Manager()
		Manager m2=Manager.getInstance();//new Manager()
		Manager m3=Manager.getInstance();//new Manager()
		Manager m4=Manager.getInstance();//new Manager()
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
}
