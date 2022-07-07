package design.pattern.creational.factory.solution;

public class Bike implements Vehicle {
    @Override
    public void build() {
        System.out.println("Building Bike");
    }
}
