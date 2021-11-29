package Minecraft;

import java.util.*;

public class Glass extends Block{
    /*
    glass
    color: can be defined at creation. When not given: transparent.
    light transmission: can be defied at creation. When not given: 99%.
    can not be crossed
    can be placed after: mud, brick, ice, air, glowstone, door
    prints:
    Block of type: ...
    Has light transmission: ...
    Can not be crossed.
     */

    public Glass (String color, int lightTransmission){
        super("glass", color, lightTransmission, false, "mud,brick,ice,air,glowStone,door");
    }

    public Glass (int lightTransmission){
        super("glass", "transparent", lightTransmission, false, "mud,brick,ice,air,glowStone,door");
    }

    public Glass (String color){
        super("glass", color, 99, false, "mud,brick,ice,air,glowStone,door");
    }


    public Glass (){
        super("glass", "transparent", 99, false, "mud,brick,ice,air,glowStone,door");
    }

}
