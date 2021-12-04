package com.company.Music;

public abstract class StringedInstrument extends Instrument {

    private int numberOfStrings;

    public StringedInstrument (String instrumentName, int numberOfStrings){
        super(instrumentName);
        this.numberOfStrings = numberOfStrings;
    }

    public abstract void sound();

    @Override
    public void play() {
        sound();
    }

    public int getNumberOfStrings(){
        return numberOfStrings;
    }

    public void getInfo(){
        System.out.print(super.instrumentName + ", a " + this.numberOfStrings + "-stringed instrument that goes ");
    }

}
