package com.company;

import com.company.Music.*;

import java.util.ArrayList;
import java.util.List;


public class AppMusic {
    /*
    Create a package called com.greenfoxacademy.music. Create the corresponding classes in this package. The AppMusic class (see below) will reference to these classes.

    We start with a base, abstract class Instrument.

    it reserves (e.g. protected) the name of the instrument
    it should provide a play() method.
    Next, we add another abstract class, StringedInstrument which extends Instrument. It

    introduces numberOfStrings and
    sound() method what's implementation is yet unknown
    but with the help of the sound() the play() method is fully implementable
    StringedInstrument has 3 descendants, namely:-

    Electric Guitar (6 strings, "Twang")
    Bass Guitar (4 strings, "Duum-duum-duum")
    Violin (4 strings, "Screech")
    The Workshop should be invoked by an App Class which is placed outer than the package

    We expect the following output:
    Test 1 Play
    Electric Guitar, a 6-stringed instrument that goes Twang
    Bass Guitar, a 4-stringed instrument that goes Duum-duum-duum
    Violin, a 4-stringed instrument that goes Screech
    Test 2, create Electric, Bass Guitar with 7 and 5 strings.
    Test 2 Play
    Electric Guitar, a 7-stringed instrument that goes Twangg
    Bass Guitar, a 5-stringed instrument that goes Duum-duum-duum
     */

    public static void main(String[] args) {

        ElectricGuitar guitar = new ElectricGuitar();
        BassGuitar bassGuitar = new BassGuitar();
        Violin violin = new Violin();

        Workshop test1Instruments = new Workshop();

        test1Instruments.addInstrument(guitar);
        test1Instruments.addInstrument(bassGuitar);
        test1Instruments.addInstrument(violin);

        System.out.println("Test 1 Play");
            test1Instruments.getInfo();


        System.out.println("Test 2, create Electric Guitar, Bass Guitar with 7 and 5 strings .");
        ElectricGuitar guitar2 = new ElectricGuitar(7);
        BassGuitar bassGuitar2 = new BassGuitar(5);

        Workshop test2Instruments = new Workshop();

        test2Instruments.addInstrument(guitar2);
        test2Instruments.addInstrument(bassGuitar2);


        System.out.println("Test 2 Play");
        test2Instruments.getInfo();

    }
}
