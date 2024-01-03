package DesignPatterns.Adapter.Example2.adapters;

//import refactoring_guru.adapter.example.round.RoundPeg;
//import refactoring_guru.adapter.example.square.SquarePeg;

import DesignPatterns.Adapter.Example2.round.RoundPeg;
import DesignPatterns.Adapter.Example2.square.SquarePeg;

/**
 * EN: Adapter allows fitting square pegs into round holes.
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // EN: Calculate a minimum circle radius, which can fit this peg.
        //
        // RU: Рассчитываем минимальный радиус, в который пролезет этот колышек.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
