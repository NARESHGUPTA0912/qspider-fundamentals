public class VehicleDriver {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setVehicleInfo("Nexon", "Blue", 50000.0);

        vehicle1.getVehicleInfo();

        Vehicle vehicle2 = new Vehicle();
        vehicle2.setVehicleInfo("Safari", "White", 15000.0);
        vehicle2.getVehicleInfo();
    }
}
