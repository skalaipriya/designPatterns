package design.pattern.creational.factory.issue;

public class Bike implements Vehicle{
    @Override
    public void build() {
        System.out.println("Building Bike");
    }
}
