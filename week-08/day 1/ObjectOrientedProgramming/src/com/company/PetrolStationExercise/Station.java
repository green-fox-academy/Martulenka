package com.company.PetrolStationExercise;

public class Station {
    /*it stores how much gas is available: gasAmount
    it can refill a car: refill(car):
    decreases the gasAmount by the capacity of the car (let us suppose that the car is empty) and
    increases the car's gasAmount*/

    int gasAmount;

    public Station (int gasAmount){
        this.gasAmount = gasAmount;
    }

    void refill(Car car){
        if (car.gasAmount < car.tankCapacity){
            System.out.println("refueling...");
            this.gasAmount -= car.tankCapacity;
            car.gasAmount = car.tankCapacity;
        }
    }
}
