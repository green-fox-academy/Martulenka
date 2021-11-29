package Minecraft;

public class Ice extends Block{
    /*
    ice
    color: transparent
    light transmission: 97
    can not be crossed
    can be placed after: mud, brick, glass, lava, air, glowstone
    it can transform its neighbor (the already existing block they are placed next to)
    changes lava to glass
    prints:
    Block of type: ...
    Has light transmission: ...
    Can not be crossed.
    Made no transformation / Has transformed a block of type ... to ...
     */

    public Ice (){
        super("ice", "transparent", 97, false, "mud,brick,glass,lava,air,glowStone");
    }

    public void printStatus(String previousType){

        System.out.println("Block of type: Ice\nHas light transmission: 97\nCan not be crossed.");

        if(previousType.contains("lava")){
            System.out.println("Has transformed a block of type lava to glass");
        }else{
            System.out.println("Made no transformation");
        }
    }
}
