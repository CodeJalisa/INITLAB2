package Hewitt.Jalisa.InitializationLab2;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by jalisahewitt on 9/10/16.
 */
public class ThingContainerTest {
    @Test
    public void addColorTest(){
        ThingContainer tc = new ThingContainer(1);
        ColorfulThing c1 = new ColorfulThing(ColorfulThing.Color.GREEN);
        tc.addColor(c1);
        assertEquals("First element was not green", c1, tc.getColorfulThings()[0]);
    }
    @Test
    public void printThings(){

    }

    @Test
    public void PopTest(){
        ThingContainer tc = new ThingContainer(3);
        ColorfulThing c1 = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing c2 = new ColorfulThing(ColorfulThing.Color.BLUE);
        tc.addColor(c1);
        tc.addColor(c2);
        assertEquals("It failed to remove or return the last color", c2, tc.Pop());
    }

    @Test
    public void removeTest(){
        ThingContainer tc = new ThingContainer(3);
        ColorfulThing c1 = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing c2 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing c3 = new ColorfulThing(ColorfulThing.Color.PURPLE);
        tc.addColor(c1);
        tc.addColor(c2);
        tc.addColor(c3);
        assertEquals("It failed to remove or return the enum color", c1, tc.remove(ColorfulThing.Color.GREEN));
        assertEquals("It failed to remove or return the colorful color", c2, tc.remove(c2));



    }
}
