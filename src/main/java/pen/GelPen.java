package pen;

import pen.base.AbstractPen;
import pen.ink.Ink;
import pen.strategy.OpenCloseStrategy;
public class GelPen extends AbstractPen {

    public GelPen(String brand, String name, double price, OpenCloseStrategy openCloseStrategy, Ink ink) {
        super(brand, name, price, openCloseStrategy, ink);
    }

    @Override
    public void write() {
        System.out.println("Writing with " + getInk().getDescription() + " using GelPen");
    }
}
