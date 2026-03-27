package polymorphism.vehicleProject;

class Bus extends Vehicle {

    public Bus(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void move() {
        System.out.println(getName() + " (Bus) is carrying passengers at speed " + getSpeed());
    }
}
