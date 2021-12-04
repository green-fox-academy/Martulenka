package com.company.Music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar (){
        super("Bass guitar", 4);
    }

    public BassGuitar (int numberOfStrings){
        super("Bass guitar", numberOfStrings);
    }

    public void sound(){
        System.out.println("Duum-duum-duum");
    }

}
