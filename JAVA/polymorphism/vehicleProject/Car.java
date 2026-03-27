package polymorphism.vehicleProject;

class Car extends Vehicle {

    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void move() {
        System.out.println(getName() + " (Car) is driving at speed " + getSpeed());
    }
}

