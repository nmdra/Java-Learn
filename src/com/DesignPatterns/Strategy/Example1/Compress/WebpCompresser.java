package DesignPatterns.Strategy.Example1.Compress;

public class WebpCompresser implements Compressor {
    @Override
    public void apply(String filename) {
        System.out.println("Webp Filter Applied");
    }
}
