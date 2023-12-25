package DesignPatterns.Strategy.Example1.Compress;

public interface Compressor {
    //  byte[] compress(byte[] image);

    void apply(String filename);
}
