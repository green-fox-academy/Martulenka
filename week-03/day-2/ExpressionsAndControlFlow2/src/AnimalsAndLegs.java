import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);

        System.out.println("Old McDonald had a farm\nEe i ee i o\nAnd how many chickens did he have on this farm?");

        int chickCount = scanner.nextInt();

        System.out.println("Ee i ee i o\nAnd how many pigs did he have on this farm?");

        int pigCount = scanner.nextInt();

        System.out.println("Ee i ee i o\nThat's a lot of cluck-cluck here and a lot of oink-oink there\nThat's " + (chickCount*2 + pigCount*4) + " legs");

    }
}