package Minecraft;

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

        Glass glass = new Glass();

        glass.printStatus();

    }
}
