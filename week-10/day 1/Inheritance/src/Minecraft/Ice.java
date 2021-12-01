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
    private String transferredType = "";

    public Ice (){
        super("ice", "transparent", 97, false, "mud,brick,glass,lava,air,glowStone");
    }

    @Override
    public void printStatus(){

        System.out.println("Block of type: ice\nHas light transmission: 97\nCan not be crossed.");

        if(transferredType.contains("lava")){
            System.out.println("Has transformed a block of type lava to glass");
        }else{
            System.out.println("Made no transformation");
        }
    }

    @Override
    public Block transferBlock(Block previousBlock){
        if(previousBlock.getType() == "lava"){
            Glass glass = new Glass();
            transferredType = "lava";
            return glass;
        }else {
            return previousBlock;
        }
    }

}
