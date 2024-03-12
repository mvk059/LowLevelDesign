package pen.ink.decorator;

import pen.ink.Ink;

/**
 * InkDecorator serves as the base class for all ink decorators, following the Decorator Pattern.
 * It holds a reference to an Ink object and delegates calls to it, allowing subclasses to add
 * additional behavior to the getDescription() method.
 */
public abstract class InkDecorator implements Ink {
    protected Ink decoratedInk; // Reference to the Ink object being decorated

    public InkDecorator(Ink decoratedInk) {
        this.decoratedInk = decoratedInk;
    }

    @Override
    public String getDescription() {
        // Delegates the call to the decorated ink object
        return decoratedInk.getDescription();
    }
}