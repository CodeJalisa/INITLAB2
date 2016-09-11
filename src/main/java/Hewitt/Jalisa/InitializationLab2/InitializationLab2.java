package Hewitt.Jalisa.InitializationLab2;

/**
 * Created by jalisahewitt on 9/10/16.
 */
public class InitializationLab2 {

    public static void main(String[] args){
        ColorfulThing c1 = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing c2 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing c3 = new ColorfulThing(ColorfulThing.Color.PURPLE);
        ColorfulThing c4 = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing c5 = new ColorfulThing(ColorfulThing.Color.GRAY);
        ColorfulThing c6 = new ColorfulThing(ColorfulThing.Color.BLACK);

        ThingContainer tc = new ThingContainer(6);
        tc.addColor(c1);
        tc.addColor(c2);
        tc.addColor(c3);
        tc.addColor(c4);
        tc.addColor(c5);
        tc.addColor(c6);
        tc.printThings();
        tc.Pop();
        tc.printThings();
        tc.remove(ColorfulThing.Color.RED);
        tc.printThings();
        tc.remove(c3);
        tc.printThings();


    }
}
