package design.pattern.creational.observer;

public class ClientTestObserverpattern {
    public static void main(String[] args) {
        Product ledTV = new Product("ledTV", "20,000", false, "This is samsung led tv");
        Product lenovoMobile = new Product("lenovoMobile", "20,000", false, "This is lenovo Mobile");
        User naveen = new User("Naveen", 25);
        User praveen = new User("Praveen", 35);
        ledTV.register(naveen);
        ledTV.register(praveen);
        lenovoMobile.register(naveen);
        lenovoMobile.register(praveen);

        ledTV.setAvailability(true);
        lenovoMobile.unregister(praveen);
        lenovoMobile.setAvailability(true);


    }
}
