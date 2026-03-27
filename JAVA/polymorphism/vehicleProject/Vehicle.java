package polymorphism.vehicleProject;

// Parent class
class Vehicle {
    private final String name;
    private final int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void start() {
        System.out.println(name + " is starting...");
    }

    public void move() {
        System.out.println(name + " is moving at speed " + speed);
    }

    public void stop() {
        System.out.println(name + " has stopped.");
    }
}

