package com.gfa.programmerfoxclub.service;

import com.gfa.programmerfoxclub.models.Fox;

import java.util.List;

public interface FoxService {

    List<Fox> getAllFoxes();
    void addFox(Fox fox);
    void removeFox(Long id);
    Fox getFox(String name);
}
