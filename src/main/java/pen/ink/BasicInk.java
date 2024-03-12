package pen.ink;

/**
 * BasicInk provides a simple implementation of the Ink interface, serving as the
 * foundation for more specific ink types. This class can be extended to create
 * various ink types with additional properties (e.g., shining, sparkling, waterproof).
 */
public class BasicInk  implements Ink {

    private String color;

    public BasicInk(String color) {
        this.color = color;
    }
    @Override
    public String getDescription() {
        return color + " Basic Ink";
    }
}
