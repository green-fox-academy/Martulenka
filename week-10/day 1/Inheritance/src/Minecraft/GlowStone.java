package Minecraft;

public class GlowStone extends Block {
    /*
    glowstone
    color: white
    light transmission: 300
    can not be crossed
    can be placed after: glass, ice, air, lava
    it can transform its neighbor (the already existing block they are placed next to)
    transforms glass to gold (that has light transmission 160)
    prints:
    Block of type: ...
    Has light transmission: ...
    Can not be crossed.
    Made no transformation / Has transformed a block of type ... to ...
     */

    public GlowStone(){

        super("glowStone", "white", 300, false, "glass,ice,air,lava");
    }

    public void printStatus(String previousType){

        System.out.println("Block of type: Ice\nHas light transmission: 97\nCan not be crossed.");

        if(previousType.contains("glass")){
            System.out.println("Has transformed a block of type glass to gold");
        }else{
            System.out.println("Made no transformation");
        }
    }

}
