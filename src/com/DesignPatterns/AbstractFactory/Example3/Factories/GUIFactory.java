package DesignPatterns.AbstractFactory.Example3.Factories;

import DesignPatterns.AbstractFactory.Example3.Buttons.Button;
import DesignPatterns.AbstractFactory.Example3.Checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}