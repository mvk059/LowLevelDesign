package pen;

import scaler.module11_lld_3.day139_machine_coding_intro.pen.base.AbstractPen;
import scaler.module11_lld_3.day139_machine_coding_intro.pen.ink.Ink;
import scaler.module11_lld_3.day139_machine_coding_intro.pen.strategy.OpenCloseStrategy;

public class BallPen extends AbstractPen {
    public BallPen(String brand, String name, double price, OpenCloseStrategy strategy, Ink ink) {
        super(brand, name, price, strategy, ink);
    }
    @Override
    public void write() {
        System.out.println("Writing with " + getInk().getDescription() + " using BallPen");
    }
}