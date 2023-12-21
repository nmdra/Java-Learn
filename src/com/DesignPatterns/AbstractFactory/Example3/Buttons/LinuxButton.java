package DesignPatterns.AbstractFactory.Example3.Buttons;

/**
 * All products families have the same varieties (Linux/Windows).
 *
 * This is a Linux variant of a button.
 */
public class LinuxButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created Linux Button.");
    }
}
