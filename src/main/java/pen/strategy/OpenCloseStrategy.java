package pen.strategy;

/**
 * Defines a strategy for opening and closing pens. This pattern allows for the dynamic
 * change of opening/closing behaviors at runtime, promoting flexibility and adherence to
 * the Open/Closed Principle by enabling easy introduction of new mechanisms.
 */
public interface OpenCloseStrategy {
    void open();
    void close();
}
