package com.company.Music;

public class Violin extends StringedInstrument {

    public Violin (){
        super("Violin", 4);
    }

    public Violin (int numberOfStrings){
        super("Violin", numberOfStrings);
    }

    public void sound(){
        System.out.println("Screech");
    }



}
