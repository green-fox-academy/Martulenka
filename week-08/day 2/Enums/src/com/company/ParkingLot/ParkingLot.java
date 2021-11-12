package com.company.ParkingLot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
    /*Create a Car class with 2 enum properties
        enum of car types
        The types of these cars or vehicles is up to you
        enum of colors
    Create 256 Vehicles randomly and put them into a List
    Count and Print the number of same vehicles for each type
    Count and Print the number of same vehicles for each color
    Print the most frequently occurring vehicle*/

    public static void main(String[] args) {
        List<Car> vehicles = new ArrayList<>();

        for (int i = 0; i < 256; i++) {
            vehicles.add(new Car (Car.carTypes.values()[GetRandomNumber(Car.carTypes.values().length-1)],Car.colors.values()[GetRandomNumber(Car.colors.values().length-1)]));
        }

        int typeCount = 0;


        for (int i = 0; i < Car.carTypes.values().length-1; i++) {
            for (int j = 0; j < vehicles.size(); j++) {
                if (vehicles.get(j).typeOfCar == Car.carTypes.values()[i]){
                    typeCount ++;
                }
            }
            System.out.println(Car.carTypes.values()[i] + ": " + typeCount);
            typeCount = 0;
        }


        int colorCount = 0;

        for (int i = 0; i < Car.colors.values().length-1; i++) {
            for (int j = 0; j < vehicles.size(); j++) {
                if (vehicles.get(j).carColor == Car.colors.values()[i]){
                    colorCount ++;
                }
            }
            System.out.println(Car.colors.values()[i] + ": " + colorCount);
            colorCount = 0;
        }

        HashMap<String, Integer> vehicleCounter = new HashMap<String, Integer>();

        int counter = 0;

        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicleCounter.containsKey(vehicles.get(i).carColor + " " + vehicles.get(i).typeOfCar)){
                vehicleCounter.put(vehicles.get(i).carColor + " " + vehicles.get(i).typeOfCar, vehicleCounter.get(vehicles.get(i).carColor + " " + vehicles.get(i).typeOfCar)+1);
            } else {
                vehicleCounter.put(vehicles.get(i).carColor + " " + vehicles.get(i).typeOfCar,0);
            }
        }

        String mostFrequentVehicle = "";
        int previousMax = 0;
        for (Map.Entry<String, Integer> entry : vehicleCounter.entrySet()){
            if(previousMax < entry.getValue()){
                mostFrequentVehicle = entry.getKey();
                previousMax = entry.getValue();
            }
        }

        System.out.println(mostFrequentVehicle);

    }

    public static int GetRandomNumber(int max) {
        int min = 0;
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

}
