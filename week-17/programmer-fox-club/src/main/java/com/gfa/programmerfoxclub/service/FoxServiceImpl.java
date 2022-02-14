package com.gfa.programmerfoxclub.service;

import com.gfa.programmerfoxclub.models.Fox;

import java.util.ArrayList;
import java.util.List;

public class FoxServiceImpl implements FoxService{
    private List<Fox> foxes;

    public FoxServiceImpl(){
        this.foxes = new ArrayList<>();
    }

    @Override
    public List<Fox> getAllFoxes(){
        return foxes;
    }

    @Override
    public void addFox(Fox fox){
        foxes.add(fox);
    }

    @Override
    public void removeFox(String name){
        foxes.removeIf(fox -> fox.getName().equals(name));
    }

    @Override
    public Fox getFox(String name){
        return foxes.stream().filter(fox ->  name.equals(fox.getName())).findAny().orElse(null);
    }
}
