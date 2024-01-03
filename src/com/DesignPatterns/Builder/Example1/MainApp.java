package DesignPatterns.Builder.Example1;

import DesignPatterns.Builder.Example1.model.CarBuilder;

public class MainApp {

    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.buildBugatti(builder);
        builder.model("Chiron");
        builder.color("SkyBlue");
        System.out.println(builder.build());
    }

}
