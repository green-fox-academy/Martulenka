package com.company.CountLetters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {
    CountLetters cl;

    @BeforeEach
    public void setup() {
        cl = new CountLetters();
    }

    @Test
    void getSize(){
     assertEquals(6,cl.getOccurrence("martina").size());
    }

    @Test
    void getOccurrenceOfA(){
        assertEquals(2,cl.getOccurrence("martina").get('a'));
    }



}