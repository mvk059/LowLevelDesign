package pen.ink.decorator;

import scaler.module11_lld_3.day139_machine_coding_intro.pen.ink.Ink;

public class SparklingInkDecorator extends InkDecorator {

    public SparklingInkDecorator(Ink decoratedInk) {
        super(decoratedInk);
    }

    @Override
    public String getDescription() {
        return super.decoratedInk.getDescription() + ", Sparkling";
    }
}
