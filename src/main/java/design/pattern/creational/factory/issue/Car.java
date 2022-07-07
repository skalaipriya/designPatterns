package design.pattern.creational.factory.issue;

public class Car implements Vehicle{
    @Override
    public void build() {
        System.out.println("Building Car");
    }
}
