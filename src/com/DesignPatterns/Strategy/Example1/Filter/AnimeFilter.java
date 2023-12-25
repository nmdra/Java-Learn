package DesignPatterns.Strategy.Example1.Filter;

public class AnimeFilter implements Filter {
    @Override
    public void apply(String filename) {
        System.out.println("Anime Filter Applied.");
    }
}
