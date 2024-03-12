package pen.ink;

/**
 * The Ink interface and its implementations enable the representation of different ink
 * properties, including color and special characteristics like shining, sparkling, and waterproof.
 * The Decorator pattern is used here to allow for dynamic composition of ink properties.
 */
public interface Ink {
    String getDescription();
}
