package pen;

import pen.base.AbstractPen;
import pen.ink.Ink;
import pen.strategy.OpenCloseStrategy;

public class BallPen extends AbstractPen {
  public BallPen(String brand, String name, double price, OpenCloseStrategy strategy, Ink ink) {
    super(brand, name, price, strategy, ink);
  }

  @Override
  public void write() {
    System.out.println("Writing with " + getInk().getDescription() + " using BallPen");
  }
}