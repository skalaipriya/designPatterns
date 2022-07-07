package design.pattern.creational.factory.solution;

public class VehicleFactory {

    public static Vehicle buildVehicle(String vehicleTypeNeeded){
        Vehicle vehicle = null;
        if(vehicleTypeNeeded.equalsIgnoreCase("Bike"))
            vehicle = new Bike();
        else if (vehicleTypeNeeded.equalsIgnoreCase("Car"))
            vehicle = new Car();
        else if (vehicleTypeNeeded.equalsIgnoreCase("Cycle"))
            vehicle = new Cycle();
        else
            System.err.println("Invalid input passed, please correct your vehicle Type passed!");

        if(vehicle != null) vehicle.build();

        return vehicle;
    }
}
