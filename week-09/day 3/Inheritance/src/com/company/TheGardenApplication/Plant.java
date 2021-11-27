package com.company.TheGardenApplication;

public class Plant {

    private String plantName;
    private int waterLevel;
    private int waterAbsorption;
    private int waterNeedLevel;

    Plant(String plantColor, int waterAbsorption, int waterNeedLevel){
        this.plantName = plantColor;
        this.waterLevel = 0;
        this.waterAbsorption = waterAbsorption;
        this.waterNeedLevel = waterNeedLevel;
    }

    public void water(int waterAmount){
        waterLevel = waterLevel + (waterAmount)*(int)(waterAbsorption/100.0);
        info();
    }

    public void info(){
        if(waterLevel < waterNeedLevel){
            System.out.println("The " + plantName + " needs water");
        }else{
            System.out.println("The " + plantName + " doesnt need water");
        }
    }
}
