package pen.ink.decorator;

import pen.ink.Ink;

public class WaterproofInkDecorator extends InkDecorator {

    public WaterproofInkDecorator(Ink decoratedInk) {
        super(decoratedInk);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Waterproof";
    }
}
