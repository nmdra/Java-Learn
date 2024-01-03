package DesignPatterns.Builder.Example1;

import DesignPatterns.Builder.Example1.model.Builder;

public class Director {

    public void buildBugatti(Builder builder) {
        builder.brand("Bugatti")
                .color("Blue")
                .nbrOfDoors(2)
                .engine("8L")
                .height(115);
    }

    public void buildLambo(Builder builder) {
        builder.brand("Lamborghini")
                .model("Aventador")
                .color("Yellow")
                .height(120);
    }

}

