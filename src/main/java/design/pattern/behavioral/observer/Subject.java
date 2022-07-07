package design.pattern.behavioral.observer;

public interface Subject {

    void register(Observer observer);
    void unregister(Observer oberver);
    void notifyObservers();

}
