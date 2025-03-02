package DesignPatterns.DependencyInjection;

// Concrete Impl
public class DieselEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Diesel Engine is starting");
    }
}
