package pen.ink.decorator;

import pen.ink.Ink;

public class SparklingInkDecorator extends InkDecorator {

    public SparklingInkDecorator(Ink decoratedInk) {
        super(decoratedInk);
    }

    @Override
    public String getDescription() {
        return super.decoratedInk.getDescription() + ", Sparkling";
    }
}
