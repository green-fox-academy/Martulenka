public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double sideA = 15;
        double sideB = 12;
        double sideC = 5;

        System.out.println("Surface Area: " + sideA * sideB * sideC);
        System.out.println("Volume: " + 2*(sideA * sideB + sideA * sideC + sideB * sideC));
    }
}