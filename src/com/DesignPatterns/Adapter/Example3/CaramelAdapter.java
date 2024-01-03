package DesignPatterns.Adapter.Example3;

import DesignPatterns.Adapter.Example3.avaFilters.Caramel;

public class CaramelAdapter extends Caramel implements Filter {
  @Override
  public void apply(Image image) {
    init();
    render(image);
  }
}
