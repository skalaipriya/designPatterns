package design.pattern.behavioral.observer;

public class User implements Observer{

    private String name;
    private int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public void update(String message) {
        System.out.println(message+ " ---> Updated user: "+ name);
    }

    @Override
    public String toString(){
        return String.format("User %s",name);
    }
}
