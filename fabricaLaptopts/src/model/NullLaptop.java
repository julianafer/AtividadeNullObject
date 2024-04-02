package model;

public class NullLaptop implements Laptop{
    
    @Override
    public void runTests() {
        System.out.println("Laptop is null");
    }
}
