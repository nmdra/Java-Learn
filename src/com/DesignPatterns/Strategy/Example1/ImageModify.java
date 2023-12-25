// Context Class

package DesignPatterns.Strategy.Example1;

import DesignPatterns.Strategy.Example1.Compress.Compressor;
import DesignPatterns.Strategy.Example1.Compress.JpegCompressor;
import DesignPatterns.Strategy.Example1.Filter.AnimeFilter;
import DesignPatterns.Strategy.Example1.Filter.Filter;

public class ImageModify {
    private Compressor compressor;
    private Filter filter;

    public ImageModify(){
        this.compressor = new JpegCompressor();
        this.filter = new AnimeFilter();
    };

    public ImageModify(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void modify(String filename) {
        compressor.apply(filename);
        filter.apply(filename);
    }

    public void modifyTwo(String filename, Compressor compressor, Filter filter) {
        compressor.apply(filename);
        filter.apply(filename);
    }
}
