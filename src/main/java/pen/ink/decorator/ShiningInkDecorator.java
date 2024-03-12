package pen.ink.decorator;

import pen.ink.Ink;

public class ShiningInkDecorator extends InkDecorator {

    public ShiningInkDecorator(Ink decoratedInk) {
        super(decoratedInk);
    }

    @Override
    public String getDescription() {
        return super.decoratedInk.getDescription() + ", Shining";
    }
}