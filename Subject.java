package design.pattern.creational.observer;

public interface Subject {

    void register(Observer observer);
    void unregister(Observer oberver);
    void notifyObservers();

}
