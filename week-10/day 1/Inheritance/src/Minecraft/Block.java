package Minecraft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Block {
/*
Every Block has the following properties
type / like: "mud", "air" or "gold"
color
light transmission / some blocks can get light go through (or even emit light)
whether it can be crossed or not
list of the block types it can be adjacent to
Every block has the following methods
canPlaceAfter(block)

Decides whether the given block can be placed after the one given as a parameter. Every block can be placed only next to a block that is on its "adjacent to" list.
getTransmission()

Tells how much percent of light can the block transmit to the other side of the wall.
printStatus()

Prints the most important properties of the block.
 */

    private String type;
    private String color;
    private int lightTransmission;
    private boolean canBeCrossed;
    private List<String> neighbours;

    public Block (String type, String color, int lightTransmission, boolean canBeCrossed, String neighboursString){
        this.type = type;
        this.color = color;
        this.lightTransmission = lightTransmission;
        this.canBeCrossed = canBeCrossed;
        this.neighbours = new ArrayList<String>(Arrays.asList(neighboursString.split(",")));
    }

    public Boolean canPlaceAfter(Block block){
        return neighbours.contains(block.type);
    }

    public int getTransmission(){
        return lightTransmission;
    }

    public String getType(){
        return type;
    }

    public void printStatus(){

        System.out.println("Block of type: " + type + "\nHas light transmission: " + lightTransmission);

        if(canBeCrossed){
            System.out.println("Can be crossed. ");
        }else {
            System.out.println("Can not be crossed. ");
        }
    }

    public Block transferBlock(Block previousBlock){return previousBlock;
    }

}
