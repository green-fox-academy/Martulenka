package com.gfa.programmerfoxclub.service;

import com.gfa.programmerfoxclub.models.Fox;

import java.util.List;

public interface FoxService {

    List<Fox> getAllFoxes();
    void addFox(Fox fox);
    void removeFox(String name);
    Fox getFox(String name);
}
