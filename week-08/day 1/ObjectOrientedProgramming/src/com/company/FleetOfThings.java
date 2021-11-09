package com.company;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // - You have the `Thing` class
        // - You have the `Fleet` class
        // - You have the `FleetOfThings` class with a `main()` method
        // - Download those, use those
        // - Create a fleet in the main() method

        // - Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        fleet.add(new Thing("Get milk"));
        fleet.add(new Thing("Remove the obstacles"));

        Thing newThing = new Thing("Stand up");
        newThing.complete();

        fleet.add(newThing);

        newThing = new Thing("Eat lunch");
        newThing.complete();

        fleet.add(newThing);


        System.out.println(fleet);
    }
}