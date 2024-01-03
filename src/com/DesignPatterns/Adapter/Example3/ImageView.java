package DesignPatterns.Adapter.Example3;

public class ImageView {
  private Image image;

  public ImageView(Image image) {
    this.image = image;
  }

  public void apply(Filter filter) {
    filter.apply(image);
  }
}
