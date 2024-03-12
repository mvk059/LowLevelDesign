package pen.strategy;

public class ClickButtonStrategy implements OpenCloseStrategy {
    @Override
    public void open() { System.out.println("Clicking the button to open"); }
    @Override
    public void close() { System.out.println("Clicking the button to retract the pen tip"); }
}