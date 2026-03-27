package polymorphism.vehicleProject;

class Bike extends Vehicle {

    public Bike(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void move() {
        System.out.println(getName() + " (Bike) is riding at speed " + getSpeed());
    }
}

