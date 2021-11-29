package Minecraft;

public class Gold extends Block{
    /*
    color: rgb: 255,215,0
    light transmission: must be defined at creation
    can not be crossed
    can be placed after: glowStone, glass
    prints:
    Block of type: ...
    Has light transmission: ...
    Can not be crossed.
     */

    public Gold (int lightTransmission){
        super("gold", "rgb: 255,215,0", lightTransmission, false, "glowStone,glass");
    }

}
