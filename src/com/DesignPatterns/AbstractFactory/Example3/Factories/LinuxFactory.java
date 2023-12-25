package DesignPatterns.AbstractFactory.Example3.Factories;

import DesignPatterns.AbstractFactory.Example3.Buttons.LinuxButton;
import DesignPatterns.AbstractFactory.Example3.Checkboxes.LinuxCheckbox;
import DesignPatterns.AbstractFactory.Example3.Buttons.Button;
import DesignPatterns.AbstractFactory.Example3.Checkboxes.Checkbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class LinuxFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}