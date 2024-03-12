package pen.base;

import pen.ink.Ink;
import pen.strategy.OpenCloseStrategy;

/**
 * Provides a common foundation for pens, encapsulating shared attributes and behaviors.
 * AbstractPen allows for code reuse and consistent implementation of the Pen interface,
 * simplifying the addition of common functionalities like brand, name, price, and the strategy
 * for opening/closing, as well as handling ink properties.
 */
public abstract class AbstractPen implements Pen {
    protected String brand;
    protected String name;
    protected double price;
    protected OpenCloseStrategy openCloseStrategy;
    protected Ink ink; // Ink property

    public AbstractPen(String brand, String name, double price, OpenCloseStrategy openCloseStrategy, Ink ink) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.openCloseStrategy = openCloseStrategy;
        this.ink = ink;
    }

    // The write method remains abstract, to be implemented by concrete subclasses.

    @Override
    public String getBrand() { return brand; }

    @Override
    public String getName() { return name; }

    @Override
    public double getPrice() { return price; }

    @Override
    public void open() { openCloseStrategy.open(); }

    @Override
    public void close() { openCloseStrategy.close(); }

    @Override
    public Ink getInk() { return ink; } // Implement getInk
}
