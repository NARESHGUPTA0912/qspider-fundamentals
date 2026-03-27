package polymorphism.vehicleProject;

class Truck extends Vehicle {

    public Truck(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void move() {
        System.out.println(getName() + " (Truck) is carrying goods at speed " + getSpeed());
    }
}

