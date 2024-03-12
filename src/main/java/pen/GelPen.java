package pen;

import scaler.module11_lld_3.day139_machine_coding_intro.pen.base.AbstractPen;
import scaler.module11_lld_3.day139_machine_coding_intro.pen.ink.Ink;
import scaler.module11_lld_3.day139_machine_coding_intro.pen.strategy.OpenCloseStrategy;

public class GelPen extends AbstractPen {

    public GelPen(String brand, String name, double price, OpenCloseStrategy openCloseStrategy, Ink ink) {
        super(brand, name, price, openCloseStrategy, ink);
    }

    @Override
    public void write() {
        System.out.println("Writing with " + getInk().getDescription() + " using GelPen");
    }
}
