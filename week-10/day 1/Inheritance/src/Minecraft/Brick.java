package Minecraft;

public class Brick extends Block{
    /*
    brick
    color: can be defined at creation. If not defined: rgb: 144, 76, 42
    light transmission: 0
    can not be crossed
    can be placed after: mud, glass, air, door, window
    prints:
    Block of type: ...
    Has light transmission: ...
    Can not be crossed.
     */

    public Brick (){
        super("brick", "rgb: 144, 76, 42", 0, false, "mud,glass,air,door,window");
    }

    public Brick (String color){
        super("brick", color, 0, false, "mud,glass,air,door,window");
    }

}
