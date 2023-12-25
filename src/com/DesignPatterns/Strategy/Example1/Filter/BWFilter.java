package DesignPatterns.Strategy.Example1.Filter;

public class BWFilter implements Filter{
    @Override
    public void apply(String filename) {
        System.out.println("Black and Whilte Filter applied.");
    }
}
