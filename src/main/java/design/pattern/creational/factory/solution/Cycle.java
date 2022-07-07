package design.pattern.creational.factory.solution;

public class Cycle implements Vehicle{
    @Override
    public void build() {
        System.out.println("Building Cycle...");
    }
}
