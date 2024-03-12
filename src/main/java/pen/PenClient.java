package pen;

import pen.base.Pen;
import pen.ink.BasicInk;
import pen.ink.Ink;
import pen.ink.decorator.ShiningInkDecorator;
import pen.ink.decorator.SparklingInkDecorator;
import pen.ink.decorator.WaterproofInkDecorator;
import pen.strategy.CapStrategy;
import pen.strategy.ClickButtonStrategy;
import pen.strategy.OpenCloseStrategy;

public class PenClient {

    public static void main(String[] args) {
        // Basic Ink
        Ink blueInk = new BasicInk("Blue");
        Ink redInk = new BasicInk("Red");

        // Decorated Inks
        Ink shiningBlueInk = new ShiningInkDecorator(blueInk);
        Ink sparkingRedInk = new SparklingInkDecorator(redInk);
        Ink waterproofShiningBlueInk = new WaterproofInkDecorator(shiningBlueInk);

        // Open/Close Strategies
        OpenCloseStrategy capStrategy = new CapStrategy();
        OpenCloseStrategy clickButtonStrategy = new ClickButtonStrategy();

        // Creating pens with various configurations
        Pen gelPenWithCapAndBlueInk = new GelPen("GelBrand", "Gel1", 10.0, capStrategy, blueInk);
        Pen ballPenWithClickAndSparklingRedInk = new BallPen("BallBrand", "Ball1", 5.0, clickButtonStrategy, sparkingRedInk);
        Pen fountainPenWithCapAndWaterproofShiningBlueInk = new FountainPen("FountainBrand", "Fountain1", 30.0, capStrategy, waterproofShiningBlueInk);

        // Using the pens
        System.out.println("Using gel pen:");
        gelPenWithCapAndBlueInk.open();
        gelPenWithCapAndBlueInk.write();
        gelPenWithCapAndBlueInk.close();

        System.out.println("\nUsing ball pen:");
        ballPenWithClickAndSparklingRedInk.open();
        ballPenWithClickAndSparklingRedInk.write();
        ballPenWithClickAndSparklingRedInk.close();

        System.out.println("\nUsing fountain pen:");
        fountainPenWithCapAndWaterproofShiningBlueInk.open();
        fountainPenWithCapAndWaterproofShiningBlueInk.write();
        fountainPenWithCapAndWaterproofShiningBlueInk.close();
    }
}
