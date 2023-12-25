package DesignPatterns.Strategy.Example1.Compress;

public class JpegCompressor implements Compressor {

    @Override
    public void apply(String filename) {
        System.out.println("Jpeg Filter Applied");
    }
}
