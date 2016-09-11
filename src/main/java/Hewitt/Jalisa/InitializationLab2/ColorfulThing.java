package Hewitt.Jalisa.InitializationLab2;

/**
 * Created by jalisahewitt on 9/10/16.
 */

public class ColorfulThing {

    private Color color;

    public enum Color{
        GREEN, BLUE, PURPLE, RED, GRAY, BLACK
    }

    public ColorfulThing(Color c){
        this.color = c;
    }



    public Color getColor(){
        return color;

    }

    @Override
    public String toString(){
        return color.toString();
    }


}