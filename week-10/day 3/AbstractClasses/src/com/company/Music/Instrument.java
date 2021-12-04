package com.company.Music;

public abstract class Instrument {

    protected String instrumentName;

    public Instrument (String instrumentName){
        this.instrumentName = instrumentName;
    }

    public abstract void play();

    public String getInstrumentName(){
        return this.instrumentName;
    }

}
