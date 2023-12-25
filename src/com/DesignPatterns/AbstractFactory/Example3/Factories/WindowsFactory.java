package DesignPatterns.AbstractFactory.Example3.Factories;

import DesignPatterns.AbstractFactory.Example3.Buttons.Button;
import DesignPatterns.AbstractFactory.Example3.Buttons.WindowsButton;
import DesignPatterns.AbstractFactory.Example3.Checkboxes.Checkbox;
import DesignPatterns.AbstractFactory.Example3.Checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}