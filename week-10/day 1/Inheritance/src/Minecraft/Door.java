package Minecraft;

public class Door extends Block{
    /*
    door
    quality: must be defined at creation (1, 2 or 3)
    producer name: must be defined at creation
    color: must be defined at creation
    light transmission: must be defined at creation
    can be crossed
    can be placed after: mud, brick, air, window
    prints:
    Block of type: ...
    Has light transmission: ...
    Can be crossed.
    Manufactured by ... on quality level ...
     */

    private int quality;
    private String producerName;
    private int lightTransmission;

    public Door (int quality, String producerName, String color, int lightTransmission){
        super("door", color, lightTransmission, true, "mud,brick,air,window");
        this.quality = quality;
        this.producerName = producerName;
        this.lightTransmission = lightTransmission;
    }

    @Override
    public void printStatus(){
        System.out.println("Block of type: Window\nHas light transmission: " + lightTransmission + "\nCan be crossed.\nManufactured by " + producerName + " on quality level " + quality);
    }

}
