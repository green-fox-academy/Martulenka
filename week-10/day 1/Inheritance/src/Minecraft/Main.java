package Minecraft;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Apply the following logic:
        Create a wall using a constructor with no parameters
        Add the following new blocks to the wall using the placeBlock() method:
        Air: created with no parameters
        Brick: created with dark-gray color
        Door: created with quality 2, producer 'Mordor', color black and light transmission 60
        Glass: light transmission 80
        GlowStone: no parameters
        Window: quality 1, producer 'Liliput', color white, light transmission 70, can be crossed: true
        Window: quality 2, producer 'Asgard', color light-gray, light transmission 90, can be crossed: true
        Mud: no parameters
        Gold: light transmission 50
        Lava: no parameters
        GlowStone: no parameters
        Ice: no parameters
        Lava: no parameters
        Gold: light transmission 30
        Ice: no parameters
        Calculate and print the light transmission of the wall
        Print the status of the wall
     */
        Wall myWall = new Wall();

        Air air = new Air();
        myWall.placeBlock(air);

        Brick brick = new Brick();
        myWall.placeBlock(brick);

        Door door = new Door(2, "Mordor", "black", 60);
        myWall.placeBlock(door);

        Glass glass = new Glass();
        myWall.placeBlock(glass);

        GlowStone glowStone1 = new GlowStone();
        myWall.placeBlock(glowStone1);

        Window window1 = new Window(1, "Liliput","white",70,true);
        myWall.placeBlock(window1);

        Window window2 = new Window(2, "Asgard","light-gray",90,true);
        myWall.placeBlock(window2);

        Mud mud = new Mud();
        myWall.placeBlock(mud);

        Gold gold1 = new Gold(50);
        myWall.placeBlock(gold1);

        Lava lava1 = new Lava();
        myWall.placeBlock(lava1);

        GlowStone glowStone2 = new GlowStone();
        myWall.placeBlock(glowStone2);

        Ice ice1 = new Ice();
        myWall.placeBlock(ice1);

        Lava lava2 = new Lava();
        myWall.placeBlock(lava2);

        Gold gold2 = new Gold(30);
        myWall.placeBlock(gold2);

        Ice ice2 = new Ice();
        myWall.placeBlock(ice2);

        System.out.println("Light transmission of the wall is " + myWall.calculateLightTransmission());
        myWall.printStatus();

    }
}
