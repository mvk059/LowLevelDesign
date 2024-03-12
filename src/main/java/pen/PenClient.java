package pen;

import scaler.module11_lld_3.day139_machine_coding_intro.pen.base.Pen;
import scaler.module11_lld_3.day139_machine_coding_intro.pen.ink.BasicInk;
import scaler.module11_lld_3.day139_machine_coding_intro.pen.ink.Ink;
import scaler.module11_lld_3.day139_machine_coding_intro.pen.ink.decorator.ShiningInkDecorator;
import scaler.module11_lld_3.day139_machine_coding_intro.pen.ink.decorator.SparklingInkDecorator;
import scaler.module11_lld_3.day139_machine_coding_intro.pen.ink.decorator.WaterproofInkDecorator;
import scaler.module11_lld_3.day139_machine_coding_intro.pen.strategy.CapStrategy;
import scaler.module11_lld_3.day139_machine_coding_intro.pen.strategy.ClickButtonStrategy;
import scaler.module11_lld_3.day139_machine_coding_intro.pen.strategy.OpenCloseStrategy;

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
        gelPenWithCapAndBlueInk.write();

        System.out.println("\nUsing ball pen:");
        ballPenWithClickAndSparklingRedInk.write();

        System.out.println("\nUsing fountain pen:");
        fountainPenWithCapAndWaterproofShiningBlueInk.write();
    }
}
