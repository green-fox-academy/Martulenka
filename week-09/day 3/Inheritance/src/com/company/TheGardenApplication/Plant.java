package com.company.TheGardenApplication;

public class Plant {

    String plantName;
    double waterLevel;
    private int waterAbsorption;
    int waterNeedLevel;

    Plant(String plantColor, int waterAbsorption, int waterNeedLevel){
        this.plantName = plantColor;
        this.waterLevel = 0;
        this.waterAbsorption = waterAbsorption;
        this.waterNeedLevel = waterNeedLevel;
    }

    public void water(int waterAmount){
        waterLevel = waterLevel + (waterAmount)*(waterAbsorption/100.0);

    }

}
