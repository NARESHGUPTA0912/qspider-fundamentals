package finalKeyword.immutableClass;

public final class Car {
    private final String name;
    private final int price;
    private final String carno;

    Car(String n, int p, String cno){
        name = n;
        price = p;
        carno = cno;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public String getCarno(){
        return carno;
    }
    public void display(){
        System.out.println("It is an Immutable Class.");
        System.out.println(getName());
        System.out.println(getPrice());
        System.out.println(getCarno());
    }
}
