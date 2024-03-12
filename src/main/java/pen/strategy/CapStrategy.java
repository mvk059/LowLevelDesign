package pen.strategy;

public class CapStrategy implements OpenCloseStrategy {
    @Override
    public void open() { System.out.println("Removing the cap"); }
    @Override
    public void close() { System.out.println("Placing the cap back on"); }
}