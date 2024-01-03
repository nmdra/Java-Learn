package DesignPatterns.Adapter.Example3;

import DesignPatterns.Adapter.Example3.avaFilters.Caramel;

public class Demo {
    public static void main(String[] args) {
        ImageView imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}

// Favor Composition Over Inheritance.
