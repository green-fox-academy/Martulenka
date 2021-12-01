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

    private String transferredType = "";

    public GlowStone(){

        super("glowStone", "white", 300, false, "glass,ice,air,lava");
    }

    @Override
    public void printStatus(){

        System.out.println("Block of type: glowStone\nHas light transmission: 97\nCan not be crossed.");

        if(transferredType.contains("glass")){
            System.out.println("Has transformed a block of type glass to gold");
        }else{
            System.out.println("Made no transformation");
        }
    }

    @Override
    public Block transferBlock(Block previousBlock){
        if(previousBlock.getType() == "glass"){
            Gold gold = new Gold(160);
            transferredType = "glass";
            return gold;
        }else {
        return previousBlock;
        }
    }

}
