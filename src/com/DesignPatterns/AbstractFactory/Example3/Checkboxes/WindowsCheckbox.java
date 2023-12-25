package DesignPatterns.AbstractFactory.Example3.Checkboxes;

/**
 * All products families have the same varieties (Linux/Windows).
 *
 * This is another variant of a checkbox.
 */
public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}