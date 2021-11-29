package Minecraft;

public class Air extends Block{
    /*
    air
    color: transparent
    light transmission: 100
    can be crossed
    can be placed after: mud, brick, glass, door, window, gold
    prints:
    Block of type: ...
    Has light transmission: ...
    Can be crossed.
     */

    public Air (){
        super("air", "transparent", 100, true, "mud,brick,glass,door,window,gold");
    }

}
