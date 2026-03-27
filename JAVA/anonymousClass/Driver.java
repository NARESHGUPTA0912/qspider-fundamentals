package anonymousClass;
public class Driver {
    public static void main(String[] args) {
        Vehicle bus = new Vehicle() {
            @Override
            public void start(){
                System.out.println("Start Bus");
            }
            @Override
            public void stop(){
                System.out.println("Stop Bus");
            }
        };
        Vehicle car = new Vehicle() {
            @Override
            public void start(){
                System.out.println("Start car");
            }
            @Override
            public void stop(){
                System.out.println("Stop car");
            }
        };
        bus.test();     bus.start();        bus.stop();
        car.test();     car.start();        car.stop();
    }
}