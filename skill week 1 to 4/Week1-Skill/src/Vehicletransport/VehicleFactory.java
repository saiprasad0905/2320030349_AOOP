package Vehicletransport;

public abstract class VehicleFactory {
    // Factory method to create a vehicle
    public abstract Vehicle createVehicle();

   // methods used to execute driving
    public void driveVehicle() {
        Vehicle vehicle = createVehicle();
        vehicle.drive();
    }
}
