package com.company.Music;

import java.util.ArrayList;
import java.util.List;

public class Workshop {

    private List<StringedInstrument> workshop = new ArrayList<>();

    public void addInstrument(StringedInstrument instrument){
        workshop.add(instrument);
    }

    public void getInfo(){

        for (int i = 0; i < workshop.size(); i++) {
            workshop.get(i).getInfo();
            workshop.get(i).play();
        }

    }

}
