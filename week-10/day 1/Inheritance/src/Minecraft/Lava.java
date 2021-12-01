package Minecraft;

public class Lava extends Block{
    /*
    lava
    color: yellow
    light transmission: 170
    can not be crossed
    can be placed after: mud, brick, glass, ice, air, glowstone
    it can transform its neighbor (the already existing block they are placed next to)
    changes mud to brick and ice to air
    prints:
    Block of type: ...
    Has light transmission: ...
    Can not be crossed.
    Made no transformation / Has transformed a block of type ... to ...
     */
    private String transferredType = "";

    public Lava (){
        super("lava", "yellow", 170, false, "mud,brick,glass,ice,air,glowStone");
    }

    @Override
    public void printStatus(){

        System.out.println("Block of type: lava\nHas light transmission: 97\nCan not be crossed.");

        if(transferredType.contains("mud")){
            System.out.println("Has transformed a block of type mud to brick");
        }else if (transferredType.contains("ice")){
            System.out.println("Has transformed a block of type ice to air");
        }else{
            System.out.println("Made no transformation");
        }
    }

    @Override
    public Block transferBlock(Block previousBlock) {
        if (previousBlock.getType() == "mud") {
            Brick brick = new Brick();
            transferredType = "mud";
            return brick;
        }else if(previousBlock.getType() == "ice"){
            Air air = new Air();
            transferredType = "ice";
            return air;
        }else {
            return previousBlock;
        }
    }

}
