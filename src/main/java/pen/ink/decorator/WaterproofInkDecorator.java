package pen.ink.decorator;

import scaler.module11_lld_3.day139_machine_coding_intro.pen.ink.Ink;

public class WaterproofInkDecorator extends InkDecorator {

    public WaterproofInkDecorator(Ink decoratedInk) {
        super(decoratedInk);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Waterproof";
    }
}
