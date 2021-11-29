package com.company.AircraftCarrier;

public class Main {
    public static void main(String[] args) {

        F35 plane1 = new F35();
        F35 plane2 = new F35();
        F35 plane3 = new F35();
        F16 plane4 = new F16();
        F16 plane5 = new F16();

        Carrier myCarrier = new Carrier(500,7000);
        myCarrier.add(plane1);
        myCarrier.add(plane2);
        myCarrier.add(plane3);
        myCarrier.add(plane4);
        myCarrier.add(plane5);

        F35 plane6 = new F35();
        F35 plane7 = new F35();
        F35 plane8 = new F35();
        F16 plane9 = new F16();
        F16 plane10 = new F16();

        Carrier enemyCarrier = new Carrier(300,1500);
        enemyCarrier.add(plane6);
        enemyCarrier.add(plane7);
        enemyCarrier.add(plane8);
        enemyCarrier.add(plane9);
        enemyCarrier.add(plane10);

        myCarrier.fill();
        enemyCarrier.fill();

        myCarrier.fight(enemyCarrier);
        enemyCarrier.fight(myCarrier);

        System.out.println(myCarrier.getStatus());
        System.out.println(enemyCarrier.getStatus());

    }
}
