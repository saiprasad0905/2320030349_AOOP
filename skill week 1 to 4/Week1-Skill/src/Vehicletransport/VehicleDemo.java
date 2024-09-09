package Vehicletransport;

public class VehicleDemo {

    public static void main(String[] args) {
        
//    	factory is created for each type of vehicle
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory motorcycleFactory = new MotorCycleFactory();
        VehicleFactory truckFactory = new TruckFactory();

        
        // factory method is used here to create objects(drive vehicle)
        carFactory.driveVehicle();
        motorcycleFactory.driveVehicle();
        truckFactory.driveVehicle();
    }
}
