package Minecraft;

public class Mud extends Block{
    /*
    mud
    color: dark gray
    light transmission: 0
    can not be crossed
    can be placed after: brick, air, lava, door, window, gold
    prints:
    Block of type: ...
    Has light transmission: ...
    Can not be crossed.
     */

    public Mud (){
        super("mud", "dark gray", 0, false, "brick,air,lava,door,window,gold");
    }

}
