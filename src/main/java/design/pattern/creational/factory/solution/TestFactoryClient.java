package design.pattern.creational.factory.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestFactoryClient {

    public static void main(String[] args) {
        System.out.println("Please enter type of vehicle needed...");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            Vehicle vehicle = VehicleFactory.buildVehicle(reader.readLine());
        } catch (IOException e) {
            System.err.println("IOException occurred: "+ e.getMessage());
        }
    }

}
