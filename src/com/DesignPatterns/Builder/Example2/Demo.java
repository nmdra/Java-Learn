package DesignPatterns.Builder.Example2;

public class Demo {
    public static void main(String[] args) {
        Presentation presentation = new Presentation();

        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 1"));

        PdfDocumentBuilder builder = new PdfDocumentBuilder();

        presentation.export(builder);

        PdfDocument pdf = builder.getPdfDocument();
    }
}
