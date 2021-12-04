package com.company.Music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar (){
        super("Electric guitar", 6);
    }

    public ElectricGuitar (int numberOfStrings){
        super("Electric guitar", numberOfStrings);
    }

    public void sound(){
        System.out.println("Twang");
    }

}
