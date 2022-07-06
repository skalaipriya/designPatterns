package design.pattern.creational.observer;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class Product implements Subject{
    //Maintain list of observers and have its own state (different properties)
    //notify all observers if its state changes

    //Using direct list object for observers can cause "Lapsed Listener Problem", therefore using WeakReference!
    //List<Observer> productOserverList = new ArrayList<>();
    WeakReference<List<Observer>> productOserverList = new WeakReference<>(new ArrayList<Observer>());
    private String name;
    private String price;
    private boolean availability;
    private String description;

    public void setAvailability(boolean availability){
        this.availability = availability;
        if(this.availability == true){
            notifyObservers();
        }
    }

    public Product(String name, String price, boolean availability, String description){
        this.name = name;
        this.price = price;
        this.availability = availability;
        this.description = description;
    }
    @Override
    public void register(Observer observer) {
        System.out.println("Observer registered : " + observer+ "for the product: "+ name);
        //productOserverList.add(observer);
        productOserverList.get().add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        System.out.println("Observer unregistered : " + observer + "for the product: "+ name);
        //productOserverList.remove(observer);
        productOserverList.get().remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("State changed for the product: "+ name +",  Going to notify observers....");
        String message = String.format("The %s product is now available:  %s", name, availability);
        //productOserverList.forEach(observer -> observer.update(message));
        productOserverList.get().forEach(observer -> observer.update(message));
    }
}
