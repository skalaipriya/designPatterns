package design.pattern.creational.factory.issue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestFactoryClient {

    /*
   - Issue in the below code is there is a tight coupling between below client code and Vehicle code (our utility/library )
   - If tomorrow suppose we introduce new vehicle class in Vehicle Hierarchy then all the client(s) code needs to be modified. -> Tight Coupling
   --> Hence --> This violates OCP Principle : Open for extension but closed for modification!
   - This is where factory design pattern comes in
    -As per factory pattern, we must not have the creation of vehicle objects at the client side, rather have a VechileFactory class whose
    sole purpose would be to create different types of vehicles and all our client code needs to do is to pass the type of vehicle it needs to the factory
    and let VehicleFactory do the magic at "runtime" based on the input provided by client and create the vehicle needed and build it! -> "Loose Coupling"
    */

    public static void main(String[] args) {
        System.out.println("Please enter type of vehicle needed...");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Vehicle vehicle = null;
        try {
            String vehicleTypeNeeded = reader.readLine();
            if(vehicleTypeNeeded.equalsIgnoreCase("Bike"))
                vehicle = new Bike();
            else if (vehicleTypeNeeded.equalsIgnoreCase("Car"))
                vehicle = new Car();
            else
                System.err.println("Invalid input passed, please correct your vehicle Type passed!");

            if(vehicle != null) vehicle.build();
        } catch (IOException e) {
            System.err.println("IOException occurred: "+ e.getMessage());
        }
    }
}
