package DesignPatterns.Strategy.Example1;

import DesignPatterns.Strategy.Example1.Compress.Compressor;
import DesignPatterns.Strategy.Example1.Compress.JpegCompressor;
import DesignPatterns.Strategy.Example1.Filter.BWFilter;
import DesignPatterns.Strategy.Example1.Filter.Filter;

public class Demo {
    public static void main(String[] args) {
        Compressor jpeg = new JpegCompressor();
        Filter bw = new BWFilter();

        ImageModify image = new ImageModify(jpeg, bw);
        image.modify("Mountains");

        System.out.println("=============");

        ImageModify image2 = new ImageModify();

        image2.modify("People");

        System.out.println("=============");

        image2.modifyTwo("Cat", jpeg, bw);
    }
}
