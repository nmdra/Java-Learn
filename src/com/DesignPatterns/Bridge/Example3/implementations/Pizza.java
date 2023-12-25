package DesignPatterns.Bridge.Example3.implementations;

public abstract class Pizza {

    protected String sauce;
    protected String toppings;
    protected String crust;

    public abstract void assemble();
    public abstract void qualityCheck();

    public void setToppings(String topping) {
    }

    public void setSauce(String sauce) {
    }

    public void setCrust(String crust) {
    }
}

