package pen.base;

import scaler.module11_lld_3.day139_machine_coding_intro.pen.ink.Ink;

/**
 * Defines the core contract for all pen types. Using an interface ensures maximum
 * flexibility, allowing any class to implement Pen without enforcing a specific inheritance structure.
 * This facilitates polymorphism and future extensibility, supporting diverse pen implementations.
 */
public interface Pen {

    void write();
    String getBrand();
    String getName();
    double getPrice();
    void open();
    void close();
    Ink getInk();
}
