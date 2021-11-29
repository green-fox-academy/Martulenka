package Minecraft;

public class Window extends Block{
    /*
    window
    quality: must be defined at creation (1, 2 or 3)
    producer name: must be defined at creation
    color: must be defined at creation
    light transmission: must be defined at creation
    can be crossed: must be defined at creation
    can be placed after: mud, brick, air, door, glowstone
    prints:
    Block of type: ...
    Has light transmission: ...
    Can be crossed. / Can not be crossed.
    Manufactured by ... on quality level ...
     */

    private int quality;
    private String producerName;
    private boolean canBeCrossed;
    private int lightTransmission;

    public Window (int quality, String producerName, String color, int lightTransmission, boolean canBeCrossed){
        super("window", color, lightTransmission, canBeCrossed, "mud,brick,air,door,glowStone");
        this.quality = quality;
        this.producerName = producerName;
        this.canBeCrossed = canBeCrossed;
        this.lightTransmission = lightTransmission;
    }

    @Override
    public void printStatus(){
        System.out.println("Block of type: Window\nHas light transmission: " + lightTransmission);
        if(canBeCrossed){
            System.out.println("Can be crossed.");
        }else {
            System.out.println("Can not be crossed.");
        }
        System.out.println("Manufactured by " + producerName + " on quality level " + quality);
    }
}
