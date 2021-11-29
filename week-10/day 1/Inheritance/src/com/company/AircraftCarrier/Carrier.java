package com.company.AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    /*
    Carrier
    Create a class that represents an aircraft-carrier

    The carrier should be able to store aircrafts
    Each carrier should have a store of ammo represented by a number
    The initial ammo should be given as a constructor parameter
    The carrier also has a health point which is also given as a constructor parameter
    Methods
    add()
    It should take a new aircraft and add it to its storage
    fill()
    It should fill all the aircrafts with ammo and subtract the taken ammo from the ammo storage
    If there is not enough ammo it should start to fill the aircrafts that are priority first
    It should throw an exception if there is no ammo when this method is called
    fight()
    It should take another carrier as a reference parameter and
    fire all the ammo from the aircrafts to it
    subtract all the damage from the other carrier's health points
    getStatus()
    It should return a string describing its, and all of its aircrafts' statuses in the following format:

    HP: 5000, Aircraft count: 5, Ammo Storage: 2300, Total damage: 2280
    Aircrafts:
    Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
    Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
    Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
    Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
    Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
    If the health points are 0 then it should return: It's dead Jim :(
     */

    private List<Aircraft> aircrafts;
    private int ammoStore;
    private int health;
    private int totalDamage;

    public Carrier(int ammoStore, int health) {
        this.aircrafts = new ArrayList<>();
        this.ammoStore = ammoStore;
        this.health = health;
    }

    public void add(Aircraft aircraft){
            aircrafts.add(aircraft);
    }

    public void fill(){
        try {
            if(ammoStore > 0) {
                for (Aircraft a : aircrafts) {
                    if (a.isPriority()) {
                        ammoStore = a.refillAmmo(ammoStore);
                    }
                }

                for (Aircraft a : aircrafts) {
                    ammoStore = a.refillAmmo(ammoStore);
                }
            }else {
                throw new NoAmmoInStorageException("The ammo storage is empty");
            }
        }catch (NoAmmoInStorageException e){
        }
    }

    private class NoAmmoInStorageException extends Exception {
        private NoAmmoInStorageException(String message) {
            super(message);
        }
    }

    public void fight(Carrier enemyCarrier){

        for (Aircraft a : aircrafts) {
            enemyCarrier.totalDamage = enemyCarrier.totalDamage + a.getDamage();
            enemyCarrier.health = enemyCarrier.health - a.fight();
        }
    }

    public String getStatus(){
        String outputString = "";

        if (health>0){
            outputString = "HP: " + health + ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: " + ammoStore + ", Total damage: " + totalDamage + "\n";
            for (Aircraft a : aircrafts) {
                outputString = outputString + a.getStatus() + "\n";
            }
        }else {
            outputString = "It's dead Jim :(";
        }

        return outputString;
    }
}
