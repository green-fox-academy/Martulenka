package com.gfa.programmerfoxclub.service;

import com.gfa.programmerfoxclub.models.Fox;
import com.gfa.programmerfoxclub.repository.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxServiceImpl implements FoxService{

    private FoxRepository foxRepository;

    @Autowired
    public FoxServiceImpl(FoxRepository foxRepository) {
        this.foxRepository = foxRepository;
    }


    @Override
    public List<Fox> getAllFoxes(){
        return (List<Fox>) foxRepository.findAll();
    }

    @Override
    public void addFox(Fox fox){
        foxRepository.save(fox);
    }

    @Override
    public void removeFox(Long id){
        foxRepository.deleteById(id);
    }

    @Override
    public Fox getFox(String name){
        return foxRepository.findAll().stream().filter(fox ->  name.equals(fox.getName())).findAny().orElse(null);
    }
}
