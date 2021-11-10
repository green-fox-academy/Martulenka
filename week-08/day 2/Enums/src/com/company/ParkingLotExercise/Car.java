package com.company.ParkingLotExercise;

public class Car {
        /*Create a Car class with 2 enum properties
        enum of car types
        The types of these cars or vehicles is up to you
        enum of colors*/

    carTypes typeOfCar;
    colors carColor;

    public Car (carTypes typeOfCar, colors carColor){
        this.typeOfCar = typeOfCar;
        this.carColor = carColor;
    }

    public enum carTypes {skoda, trabant, volvo, bmw, mercedes}

    public enum colors {white, blue, green, gold, black, orange, red, gray}

}
