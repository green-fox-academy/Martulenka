package com.company.TheGardenApplication;

public abstract class Plant {

    private String plantName;
    private double waterLevel;
    private int waterAbsorption;
    private int waterNeedLevel;

    Plant(String plantName, int waterAbsorption, int waterNeedLevel){
        this.plantName = plantName;
        this.waterLevel = 0;
        this.waterAbsorption = waterAbsorption;
        this.waterNeedLevel = waterNeedLevel;
    }

    public void getPlantInfo(){
        if(waterLevel< waterNeedLevel){
            System.out.println("The " + plantName + " needs water");
        }else{
            System.out.println("The " + plantName  + " doesn't need water");
        }
    }

    public void water(int waterAmount){
        waterLevel = waterLevel + waterAmount * (waterAbsorption/100.0);
    }

    public String getPlantName() {
        return plantName;
    }

    public double getWaterLevel() {
        return waterLevel;
    }

    public int getWaterAbsorption(){
        return waterAbsorption;
    }

    public int getWaterNeedLevel() {
        return waterNeedLevel;
    }

}
