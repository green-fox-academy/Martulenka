package Minecraft;

import java.util.List;

public class Wall {
    /*
    Create a Wall class that
    has a list of blocks
    has a placeBlock() method that adds a new block to the list

    Placement is only successful when the actually placed block has the previous block type on its adjacent block list. Unsuccessful placement means: the wall does not change.
    At placing you must consider the transformation ability of the new block (if it has any)
    a printStatus() method that prints the status of every block in the wall
    a calculateLightTransmission() method that returns the percentage (integer between 0 and 100) of the light that passes through the wall. This percentage is the average of the light transmission values of the blocks in the wall.
     */

    private List<Block> wall;

    public void placeBlock(Block block){
        if(block.canPlaceAfter(wall.get(wall.size()-1))){
            wall.add(block);
        }
    }

    public void printStatus(){
        for(Block b : wall){
            b.printStatus();
        }
    }

    public int calculateLightTransmission(){
        int totalTransmission = 0;
        for(Block b : wall){
            totalTransmission += b.getTransmission();
        }

        return totalTransmission/wall.size();
    }
}
